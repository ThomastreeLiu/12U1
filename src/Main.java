import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num ;
        Scanner scan = new Scanner(System.in);
        System.out.println("input any number");
        num = scan.nextInt();
        int i = num;
        while (num<=i+10){
            System.out.println(num);
            num=num+1;
        }
    }
}