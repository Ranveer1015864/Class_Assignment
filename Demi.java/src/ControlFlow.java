import java.util.Scanner;
public class ControlFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        System.out.println("Enter number");
        a = sc.nextInt();

        if (a>0) {
            System.out.println("Number is Positive");
        }
           else if (a<0) {
                System.out.println("Number is Negative");
            }
        else{
            System.out.println("number is Zero");
        }
}
}