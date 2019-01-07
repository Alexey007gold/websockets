package com.alexkoveckiy.strategy.server.config;

import com.alexkoveckiy.strategy.server.authorization.impl.configuration.AuthorizationImplConfig;
import com.alexkoveckiy.strategy.server.dao.configuration.PersistenceJPAConfig;
import com.alexkoveckiy.strategy.server.datamapper.configuration.DataMapperConfig;
import com.alexkoveckiy.strategy.server.game.impl.configuration.GameImplConfig;
import com.alexkoveckiy.strategy.server.messenger.impl.configuration.MessengerImplConfig;
import com.alexkoveckiy.strategy.server.modelmapper.configuration.ModelMapperConfig;
import com.alexkoveckiy.strategy.server.rest.configuration.RestConfig;
import com.alexkoveckiy.strategy.server.router.configuration.RouterConfig;
import com.alexkoveckiy.strategy.server.wssession.configuration.WSSessionConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;

/**
 * Created by Alexe on 01.04.2017.
 */
@Configuration
@ComponentScan(basePackages = {"com.alexkoveckiy.strategy.server.config"},
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Configuration.class))
@Import({PersistenceJPAConfig.class,
        DataMapperConfig.class,
        AuthorizationImplConfig.class,
        MessengerImplConfig.class,
        RouterConfig.class,
        WSSessionConfig.class,
        GameImplConfig.class,
        ModelMapperConfig.class,
        RestConfig.class
})
public class Configurer {
}
