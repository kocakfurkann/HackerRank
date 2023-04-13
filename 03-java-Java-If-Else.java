import java.util.Scanner;

public class JavaIfElse {
    public static void main (String args[]) {
        Scanner tarayici = new Scanner(System.in);
        System.out.println("Sayı Giriniz:");
        int N = tarayici.nextInt();


        if (N %2>0){
            System.out.println("Weird");
        }
        else {
            if (N>=2 && N<=5){
                System.out.println("Not Weird");
            }
            else if (N>=6 && N<=20) {
                System.out.println("Weird");
            }
            else if ( N>20) {
                System.out.println("Not Weird");
            }
        }


    }
}
