package userRegister;

public class User {
    private String username;
    private String password;
    private String name;
    private String birth_date;
    private String email;
    User(String username, String password, String name, String birth_date, String email){
        this.username=username;
        this.password=password;
        this.name=name;
        this.birth_date=birth_date;
        this.email=email;
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public String getEmail() {
        return email;
    }
}
