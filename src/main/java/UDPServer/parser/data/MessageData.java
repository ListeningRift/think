package UDPServer.parser.data;

import java.sql.Timestamp;

public class MessageData {
    public String content;
    public int senderId;
    public Timestamp datatime;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public Timestamp getDatatime() {
        return datatime;
    }

    public void setDatatime(Timestamp datatime) {
        this.datatime = datatime;
    }
}
