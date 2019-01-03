package com.alexkoveckiy.strategy.server.authorization.api.message;

import com.alexkoveckiy.strategy.server.protocol.RequestData;

/**
 * @author Alexey Koveckiy on 10.04.2017.
 */
public class RegisterRequestData implements RequestData {

    private String login;
    private String password;
    private String nickName;

    public RegisterRequestData() {
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getNickName() {
        return nickName;
    }
}
