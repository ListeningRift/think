package UDPServer.parser.api;

import UDPServer.parser.data.MessageData;

public class MessageAPI {
    public String action;
    public MessageData data;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public MessageData getData() {
        return data;
    }

    public void setData(MessageData data) {
        this.data = data;
    }
}
