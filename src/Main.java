import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int usOlacak, ussuAlinacak;

        Scanner inp = new Scanner(System.in);
        System.out.println("Üssü olacak sayı");
        ussuAlinacak=inp.nextInt();

        System.out.println("Üs olacak sayıyı giriniz :");
        usOlacak =inp.nextInt();

        for (int i=1; i<=usOlacak; i++){
            ussuAlinacak *=i;

        }
        System.out.println("Sonuç : "+ ussuAlinacak);
    }
}