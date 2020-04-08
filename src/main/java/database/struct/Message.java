package database.struct;

import java.sql.Timestamp;

public class Message {
    private int senderId;
    private String message;
    private Timestamp time;

    public Message(int senderId, String message, Timestamp time) {
        this.senderId = senderId;
        this.message = message;
        this.time = time;
    }

    public int getSenderId() {
        return senderId;
    }

    public String getMessage() {
        return message;
    }

    public Timestamp getTime() {
        return time;
    }
}
