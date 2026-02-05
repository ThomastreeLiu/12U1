import java.util.Scanner;

public class Universal_T_to_t {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input any natural number you want to translate to binary");
        int numd = scan.nextInt();
        int digit = 0;
//calculate the maximum digits
        for(int i =0;i<1;){
            if (Math.pow(2,digit)<=numd)
                digit=digit+1;
            else
                i=2;
        }
//calculate the exact value
        //digit=digit+1;
        int rec = digit;
        System.out.println("Total "+(digit)+" digit(s)\n");
        int[] numb = new int[digit+1];
        while(digit>=0){
            if (Math.pow(2,digit)<=numd) {
                System.out.println("1 in digit "+(digit+1));
                numb[digit] = 1;
                numd= (int) (numd-Math.pow(2,digit));
                digit=digit-1;
            }
            else {
                numb[digit]=0;
                digit = digit - 1;
            }
        }
        System.out.println("The binary number is:");
        for (int i = rec;i>0;i--) {
            if (i % 4 == 0)
                System.out.print(" ");
            System.out.print(numb[i - 1]);
        }
    }
}
