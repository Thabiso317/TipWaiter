import java.util.Scanner;

public class tipWaiter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the bill amount: R");
        double billAmount=scanner.nextDouble();

        //call the tipWaiter function to caculate and print the tip
        tipWaiter(billAmount);

        scanner.close();
    }
    public static void tipWaiter(double bill){
        //assuming tip percentage of 15%
        double tipPercentage=0.15;
        double tipAmonut=bill * tipPercentage;
        //Display the result
        System.out.println("Your bill was R" + bill);
        System.out.println("It's polite to tip the waiter 15% of your bill.");
        System.out.println("Tip amount: R" + tipAmonut);

    }
}
