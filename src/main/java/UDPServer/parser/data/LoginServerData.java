package UDPServer.parser.data;

import database.struct.Member;
import database.struct.Message;

import java.util.List;

public class LoginServerData {
    public boolean result;
    public int ID;
    public List<Member> member;
    public List<Message> message;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public List<Member> getMember() {
        return member;
    }

    public void setMember(List<Member> member) {
        this.member = member;
    }

    public List<Message> getMessage() {
        return message;
    }

    public void setMessage(List<Message> message) {
        this.message = message;
    }
}
