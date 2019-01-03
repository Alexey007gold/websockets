package com.alexkoveckiy.strategy.server.authorization.api.message;

import com.alexkoveckiy.strategy.server.protocol.RequestData;

/**
 * @author Alexey Koveckiy on 10.04.2017.
 */
public class LoginRequestData implements RequestData {

    private String login;
    private String password;

    public LoginRequestData() {
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
