import java.util.Scanner;

public class prime20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();


        for (int i = 2; i < number; i++) {
            boolean check = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0){
                    check = false;
                    break;
                }
            }
            if (check)
                System.out.println(i);
        }
    }
}
