import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        double a = sc.nextDouble();
        System.out.println("Enter the Second number");
        double b = sc.nextDouble();
        System.out.println("Enter your choice \n 1) Addition \n 2) Subtraction \n 3) Multiplication \n 4) Division \n 5) Remainder");
        int choice = sc.nextInt();
        if(choice == 1){
            double add = a + b;
            System.out.println("The addition is  "+add);
        } else if (choice == 2) {
            double sub = a - b;
            System.out.println("The subtraction is  "+sub);
        } else if (choice == 3) {
            double mul = a * b;
            System.out.println("The multiplication is  "+mul);
        } else if (choice == 4 ) {
            double div = a / b;
            System.out.println("The division is  "+div);
        } else if (choice == 5) {
            double mod = a % b;
            System.out.println("The remainder is  "+mod);
        } else{
            System.out.println("Wrong Choice");
        }
        sc.close();
    }
}