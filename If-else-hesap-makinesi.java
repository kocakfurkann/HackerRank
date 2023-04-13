import java.util.Scanner;

public class IfElseHesapMakinesi {
    public static void main (String args[]){

        Scanner tarayici = new Scanner(System.in);

        System.out.println("(1) Toplama:");
        System.out.println("(2) Çıkarma:");
        System.out.println("(3) Çaprma:");
        System.out.println("(4) Bölme:");

        System.out.print("Tercih Yapınız:");
        int tercih = tarayici.nextInt();

        System.out.println("1.Sayıyı Giriniz:");
        int sayi1 = tarayici.nextInt();
        System.out.println("2.Sayıyı Girniiz:");
        int sayi2 = tarayici.nextInt();


        if (tercih == 1){
            System.out.println("Sonuç:"+(sayi1+sayi2));
        } else if (tercih == 2) {
            System.out.println("Sonuç:"+(sayi1-sayi2));
        } else if (tercih == 3) {
            System.out.println("Sonuç:"+(sayi1*sayi2));
        }else if (tercih == 4) {
            System.out.println("Sonuç:"+(sayi1/sayi2));
        }

    }
}

