package model;

public class Entity {
    private int id;
    private int data;
    private long bill;
    private String username;
    private String password;

    public int getId() {
        return id;
    }

    public Entity setId(int id) {
        this.id = id;
        return this;
    }

    public int getData() {
        return data;
    }

    public Entity setData(int data) {
        this.data = data;
        return this;
    }

    public long getBill() {
        return bill;
    }

    public Entity setBill(long bill) {
        this.bill = bill;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Entity setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Entity setPassword(String password) {
        this.password = password;
        return this;
    }
}
