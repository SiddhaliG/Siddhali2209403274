import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        bank b1 = new bank(50, 5000);
        System.out.println("gareeb bank");
        char operation;
        System.out.println("gareeb bank \nselect operation \n1 deposit  \n2 withdraw");
        operation = input.next().charAt(0);


        switch (operation) {
            case '1' -> {
                System.out.println("deposit");
                int d = input.nextInt();
                b1.deposit(d);
            }
            case '2' -> {
                System.out.println("withdraw if u want or blank");
                int x = input.nextInt();
                b1.withdraw(x);
            }
        }
        b1.show();




    }

}
