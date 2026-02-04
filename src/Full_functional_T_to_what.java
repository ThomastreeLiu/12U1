import java.util.Scanner;

public class Full_functional_T_to_what {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("input the data type you want to converted to, minimum of 2, maximum of 10");
        int datatype = scan.nextInt();
        System.out.println("Input any natural number you want to translate to binary");
        int numd = scan.nextInt();
        int digit = 0;
//calculate the maximum digits
        //
        for(int i =0;i<1;){
            if (Math.pow(datatype,digit)*(datatype-1)<=numd)
                digit=digit+1;
            else
                i=2;
        }
//calculate the exact value
        digit=digit-1;
        System.out.println("Total "+(digit+1)+" digit(s)\n");
        int numb = 0;
        int factor = 1;
        while(digit>=0){
            if (Math.pow(datatype,digit)<=numd) {
                factor = 1;
                for (int i = 1; i == 1;){
                    if (Math.pow(datatype,digit)*factor<=numd){
                        factor=factor+1;
                    }
                    else
                        i = 2;
                }
                System.out.println("digit in "+(digit+1));
                numb = (int) (numb + factor*Math.pow(10, digit));
                numd= (int) (numd-factor*Math.pow(datatype,digit));
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
            System.out.println("The converted number is:"+numb);
    }
}
