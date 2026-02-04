import java.util.Scanner;
import java.math.MathContext;

//This is designed for translate decimal to binary
//It can't calculate numbers greater than 1023, but it can shows how the calculation does.
//The universal one can only give the answer without giving the steps.
//As well, follow this base, we can do other form of translation
public class T_to_t {
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
        digit=digit-1;
        System.out.println("Total "+(digit+1)+" digit(s)\n");
        int numb = 0;
        while(digit>=0){
            if (Math.pow(2,digit)<=numd) {
                System.out.println("digit in "+(digit+1));
                numb = (int) (numb + Math.pow(10, digit));
                numd= (int) (numd-Math.pow(2,digit));
                digit=digit-1;
                System.out.println("currently on "+numb);
                System.out.println(numd+" left\n");
            }
            else {
                System.out.println((digit+1)+", no for this digit\n");
                digit = digit - 1;
            }
        }
        if (numb==2147483647)
            System.out.println("Data overflow, please try number smaller than 1024");
        else
            System.out.println("The binary number is:"+numb);
    }
}
