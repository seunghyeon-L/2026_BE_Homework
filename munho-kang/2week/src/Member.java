import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Member {
    String username;
    String password;
    String name;
    String birth_date;
    String email;

    Member(String username, String password, String name, String birth_date, String email){
        this.username=username;
        this.password=password;
        this.name=name;
        this.birth_date=birth_date;
        this.email=email;
    }

    public String getUsername(){
        return this.username;
    }

    public String getName(){
        return this.name;
    }

}
//username, password, name, birth_date, email