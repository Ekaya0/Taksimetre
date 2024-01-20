import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenler tanımlandı
        double km, kmÜcret = 2.20, acilisÜcret = 10, total, min = 20;

        //Scanner sınıfı tanımlandı
        Scanner input = new Scanner(System.in);

        //Kullanıcı verisi alındı
        System.out.print("Gidilen Yolu km Olarak Giriniz :");
        km = input.nextDouble();

        //
        System.out.println("Açılış Ücreti :" + acilisÜcret);
        System.out.println("Kilometre Başına Tutar :" + kmÜcret);
        System.out.println("Minimum Ücret :" + min);

        total = (km * kmÜcret) + acilisÜcret;

        total = (total < 20) ? 20 : total;
        System.out.print("Toplam Tutar :" + total);

    }
}