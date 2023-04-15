import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class JavaLoopsI {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        
        
        for ( int B= 1 ; B<11; B++){
             System.out.print(A+"\t");
             System.out.print("x\t");
             System.out.print(B +"\t");
             System.out.print("=\t");
             System.out.print(A*B +"\n");
            }
            
        }
    }
