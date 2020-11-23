package Model.Entity;

public class Entity {
    private long id;
    private String name;
    private String email;
    private String username;
    private String password;


    public long getId() {
        return id;
    }

    public Entity setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Entity setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Entity setEmail(String email) {
        this.email = email;
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
