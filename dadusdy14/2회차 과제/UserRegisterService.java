import java.util.ArrayList;
import java.util.Scanner;

public class UserRegisterService {
    private ArrayList<User> users = new ArrayList<>(); // 명부
    private Scanner sc = new Scanner(System.in);        // 도구

    public void start() {
        System.out.println("======================");
        System.out.println("회원등록");
        System.out.println("======================");

        boolean register = false;
        while (!register) {
            System.out.println("회원가입을 하시겠습니까?\ny:진행 n:취소");
            System.out.print(">> ");
            String register_input = sc.nextLine();

            if (register_input.equalsIgnoreCase("y")) {
                register = true;
                System.out.println("======================");
                System.out.println("회원가입이 진행됩니다.");
                System.out.println("======================");
            } else if (register_input.equalsIgnoreCase("n")) {
                System.out.println("회원가입이 종료됩니다.");
                System.exit(0);
            } else {
                System.out.println("입력 값을 확인해주세요.");
            }
        }

        while (true) {
            System.out.print("ID : ");
            String username = sc.nextLine();

            // 패스워드 확인 로직
            String password = "";
            while (true) {
                System.out.print("PW : ");
                password = sc.nextLine();
                System.out.print("PW 확인 : ");
                String password_confirm = sc.nextLine();

                if (password.equals(password_confirm)) {
                    break;
                } else {
                    System.out.println("패스워드가 일치하지 않습니다. 다시 입력해주세요.");
                }
            }

            System.out.print("성명 : ");
            String name = sc.nextLine();

            String birth_date = "";
            while (true) {
                System.out.print("생년월일(6자리) : ");
                birth_date = sc.nextLine();
                if (birth_date.length() == 6) {
                    break;
                } else {
                    System.out.println("생년월일 자릿수가 올바르지 않습니다.");
                }
            }

            System.out.print("이메일 : ");
            String email = sc.nextLine();

            User user = new User(username, password, name, birth_date, email);
            users.add(user);

            System.out.println("======================");
            System.out.println(user.getName() + "님, 가입을 환영합니다.");
            System.out.println("ID는 " + user.getUsername() + " 입니다.");

            System.out.println("회원가입을 이어서 진행하시겠습니까?\ny:진행 n:취소");
            System.out.print(">> ");
            String register_again = sc.nextLine();

            if (register_again.equalsIgnoreCase("n")) {
                System.out.println("모든 가입 절차를 종료합니다.");
                break;
            }
        }
    }
}