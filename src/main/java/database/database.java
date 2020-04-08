package database;

import database.struct.Member;
import database.struct.Message;

import java.sql.*;
import java.util.ArrayList;

public class database {
    Connection con;
    Statement statement;

    public database() {
        String url = "jdbc:mysql://localhost:3306/think";
        String user = "root";
        String password = "123456";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection(url, user, password);
            if (!con.isClosed())
                System.out.println("Succeeded connecting to the Database!");
            statement = con.createStatement();
        } catch (ClassNotFoundException e) {
            System.out.println("Sorry, can't find the Driver!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Sorry, database connection failed!");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public Message[] getPublicMessages() {
        String sql = "SELECT * from PublicMessage";
        ResultSet rs;
        ArrayList<Message> messages = new ArrayList<Message>();

        try {
            rs = statement.executeQuery(sql);

            while (rs.next()) {
                messages.add(new Message(rs.getInt("SenderID"), rs.getString("Message"), rs.getTimestamp("Datetime")));
            }
        } catch (SQLException e) {
            System.out.println("History messages retrieval failed!");
            e.printStackTrace();
        }
        return (Message[]) messages.toArray();
    }

    public Member[] getMembers() {
        String sql = "SELECT * from User";
        ResultSet rs;
        ArrayList<Member> members = new ArrayList<Member>();

        try {
            rs = statement.executeQuery(sql);

            while (rs.next()) {
                members.add(new Member(rs.getInt("ID"), rs.getString("Head"), rs.getString("Name"), rs.getBoolean("Status")));
            }
        } catch (SQLException e) {
            System.out.println("Members retrieval failed!");
            e.printStackTrace();
        }

        return (Member[]) members.toArray();
    }

    public void insertPublicMessage(Timestamp datetime, int senderId, String message) {
        String sql = "INSERT into publicmessage(Datetime, SenderID, Message) values(?, ?, ?)";
        int i = 0;

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setTimestamp(1, datetime);
            pst.setInt(2, senderId);
            pst.setString(3, message);
            i = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (i == 0) {
            System.out.println("Message inserted failed!");
        }
    }
}
