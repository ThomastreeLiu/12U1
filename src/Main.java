import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num[][] = {{1,3,5,7,9},{11,13,15,17,19},{21,23,25,27,29}};
        Scanner scan = new Scanner(System.in);
        System.out.println("input the 10th");
        int i10 = scan.nextInt();
        System.out.println("input the 1th");
        int i1 = scan.nextInt();
        int total = 0;
        for(int e10=0; e10<=i10; e10++)
            for(int e1=0;e1<=i1-1;e1++)
                total=total+num[e10][e1];

        System.out.println(total);
    }
}