import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num[] = {1,3,5,7,9};
        Scanner scan = new Scanner(System.in);
        System.out.println("input any number");
        int i = scan.nextInt();
        int total = 0;
        for(int e=0; e<=i-1; e++)
            total=total+num[e];
        System.out.println(total);
    }
}