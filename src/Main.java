import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan sayı alınması
        System.out.print("Birinci sayıyı giriniz: ");
        int a = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int b = input.nextInt();

        System.out.print("Üçüncü sayıyı giriniz: ");
        int c = input.nextInt();

        // İşlem sırasına göre hesaplama yapılması
        int sonuc = a + b * c - b;

        // Sonucun ekrana yazdırılması
        System.out.println("İşlem sonucu: " + sonuc);
    }
}