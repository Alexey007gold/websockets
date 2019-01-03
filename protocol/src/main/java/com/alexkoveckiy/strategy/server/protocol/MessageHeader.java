package com.alexkoveckiy.strategy.server.protocol;

/**
 * @author Alexey Koveckiy on 09.04.2017.
 */
public class MessageHeader {

    private String uuid;
    private String originUuid;
    private String type;
    private String command;

    public MessageHeader() {
    }

    public MessageHeader(String uuid, String originUuid, String type, String command) {
        this.uuid = uuid;
        this.originUuid = originUuid;
        this.type = type;
        this.command = command;
    }

    public String getUuid() {
        return uuid;
    }

    public String getOriginUuid() {
        return originUuid;
    }

    public String getType() {
        return type;
    }

    public String getCommand() {
        return command;
    }
}
