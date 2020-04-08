package UDPServer.parser.api;

import UDPServer.parser.data.LoginClientData;

public class LoginClientAPI {
    public String action;
    public LoginClientData data;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public LoginClientData getData() {
        return data;
    }

    public void setData(LoginClientData data) {
        this.data = data;
    }
}
