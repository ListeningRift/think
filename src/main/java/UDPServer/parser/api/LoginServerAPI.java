package UDPServer.parser.api;

import UDPServer.parser.data.LoginServerData;

public class LoginServerAPI {
    public String action;
    public LoginServerData data;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public LoginServerData getData() {
        return data;
    }

    public void setData(LoginServerData data) {
        this.data = data;
    }
}
