package DP2;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static Database database;

    private List<User> users;
    private List<Sendable> sendables;

    private Database() {
        users = new ArrayList<>();
        sendables = new ArrayList<>();
    }

    public static Database connect() {
        if(database == null) {
            database = new Database();
        }

        return database;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User getUserByUsername(String username) {
        for(User user : users) {
            if(user.getUsername().equals(username)) {
                return user;
            }
        }

        return null;
    }

    public void addSendable(Sendable sendable) {
        sendables.add(sendable);
    }

    public List<Sendable>getSendablesByUser(User user) {
        List<Sendable> results = new ArrayList<>();
        for(Sendable sendable : sendables) {
            if(sendable.getSender() == user || sendable.getReciever() == user) {
                results.add(sendable);
            }
        }
        return results;
    }
}

