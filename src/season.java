import java.util.Scanner;
public class season{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("월(1~12)을 입력하시오");
        int month = scanner.nextInt();
        if(3 <=month && month <= 5 ){
            System.out.print("봄입니다.");
        }
        else if(6 <=month && month <= 8 ){
            System.out.print("여름입니다.");
        }
        else if(9 <=month && month <= 11 ){
            System.out.print("가을입니다.");
        }
        else{
            System.out.print("겨울입니다.");
        }

        scanner.close();

    }
}