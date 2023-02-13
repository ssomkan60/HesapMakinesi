import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Birinci Sayıyı Giriniz:");
        int sayi1 = input.nextInt();
        System.out.println("İkinci Sayıyı Giriniz:");
        int sayi2 = input.nextInt();

        System.out.println("1:Toplama");
        System.out.println("2:Çıkarma");
        System.out.println("3:Çarpma");
        System.out.println("4:Bölme");
        System.out.println("Yapacağınız İşlemi Giriniz:");
        int islem = input.nextInt();

        switch (islem){
            case 1:
                int toplama = sayi1 + sayi2 ;
                System.out.println(toplama);
                break;
            case 2:
                int cikarma = sayi1 - sayi2;
                System.out.println(cikarma);
                break;
            case 3:
                double carpma = sayi1 * sayi2;
                System.out.println(carpma);
                break;
            case 4:
                double bolme = sayi1/sayi2;
                System.out.println(bolme);
                break;
            default:
                System.out.println("Yanlış Değer Girdiniz");
        }
    }
}
