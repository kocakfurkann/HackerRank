import java.util.*;
import java.io.*;

class JavaloopsII{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for (int sayi = 0 ; sayi < n ; sayi++) {
                a += b;
                
                if (sayi > 0){
                    System.out.print(" ");
                }
                
                System.out.print(a);
                b = b * 2 ;
            }
            System.out.print("\n");
        }
        in.close();
    }
}
