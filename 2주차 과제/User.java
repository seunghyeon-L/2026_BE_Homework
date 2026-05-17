package oop_assignment; 

public class User {
    private String username;
    private String password;
    private String name;
    private String birthDate;
    private String email;

    public User(String username, String password, String name, String birthDate, String email) {
        this.username = username; 
        this.password = password;
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
    }

    public void welcome() {
        System.out.println("---------------------");
        System.out.println(this.name + " 님, 가입을 환영합니다.");
        System.out.println("ID는 " + this.username + " 입니다.");
        System.out.println("---------------------");
    }
}
