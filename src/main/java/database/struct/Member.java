package database.struct;

public class Member {
    private int id;
    private String head;
    private String name;
    private boolean status;

    public Member(int id, String head, String name, boolean status) {
        this.id = id;
        this.head = head;
        this.name = name;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getHead() {
        return head;
    }

    public String getName() {
        return name;
    }

    public boolean getStatus() {
        return status;
    }
}
