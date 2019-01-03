package com.alexkoveckiy.strategy.server.datamapper;

import com.alexkoveckiy.strategy.server.datamapper.exception.MapperException;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.Map;

/**
 * @author Arthas
 */
@Component
public class JacksonDataMapper implements DataMapper {
    private static final String CPJ = "Can't parse json";

    private final ObjectMapper mapper;

    public JacksonDataMapper() {
        mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    public ObjectMapper getMapper() {
        return mapper;
    }

    @Override
    public <K, V> Map<K, V> convertToMap(final Object value) {
        try {
            return mapper.convertValue(value, new TypeReference<Map<K, V>>() {});
        } catch (Exception ex) {
            throw new MapperException("Can't convert to map ", ex);
        }
    }

    @Override
    public <T> T convert(Map<String, Object> map, Class<T> dataType) {
        try {
            return mapper.convertValue(map, dataType);
        } catch (Exception ex) {
            throw new MapperException("Can't convert map ", ex);
        }
    }

    @Override
    public <T> T convert(Object from, TypeReference<T> dataType) {
        try {
            return mapper.convertValue(from, dataType);
        } catch (Exception ex) {
            throw new MapperException("Can't convert map ", ex);
        }
    }

    @Override
    public <T> T convert(Object from, Class<T> dataType) {
        try {
            return mapper.convertValue(from, dataType);
        } catch (Exception ex) {
            throw new MapperException("Can't convert map ", ex);
        }
    }

    @Override
    public <T> T mapData(String data, Class<T> dataType) {
        try {
            return mapper.readValue(data, dataType);
        } catch (Exception ex) {
            throw new MapperException(CPJ, ex);
        }
    }

    @Override
    public <T> T mapData(String data, TypeReference dataType) {
        try {
            return mapper.readValue(data, dataType);
        } catch (Exception ex) {
            throw new MapperException(CPJ, ex);
        }
    }

    @Override
    public <T> T mapData(byte[] message, Class<T> dataType) {
        try {
            return mapper.readValue(message, dataType);
        } catch (Exception ex) {
            throw new MapperException(CPJ, ex);
        }
    }

    @Override
    public <T> T readValue(InputStream src, Class<T> valueType) {
        try {
            return mapper.readValue(src, valueType);
        } catch (Exception ex) {
            throw new MapperException("Can't read from stream ", ex);
        }
    }

    @Override
    public <T> String dataToString(T data) {
        try {
            return new String(mapper.writeValueAsBytes(data), "UTF-8");
        } catch (Exception ex) {
            throw new MapperException("Can't convert object to json string", ex);
        }
    }

    @Override
    public String objectToString(Object data) {
        try {
            return mapper.writeValueAsString(data);
        } catch (Exception e) {
            throw new MapperException("Can`t create string", e);
        }
    }
}
