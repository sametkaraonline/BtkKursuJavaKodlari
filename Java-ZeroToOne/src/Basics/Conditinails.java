package Basics;

public class Conditinails {

    public static void main(String[] args) {

        int sayi = 20;

        if (sayi < 20) {
            System.out.println("Sayı 20'den küçüktür.");
        } else if (sayi == 20) {
            System.out.println("Sayı 20'dir");
        }
        ;

        if (sayi < 15) {
            System.out.println("Sayı 15'den küçüktür.");
        }
        ;


        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 222;


        if (sayi1 >= sayi2 & sayi1 >= sayi3) {
            System.out.println("En büyük sayi: " + sayi1);
        } else if (sayi2 >= sayi1 & sayi2 >= sayi3) {
            System.out.println("En büyük sayi: " + sayi2);
        } else {
            System.out.println("En büyük sayi: " + sayi3);
        }
        ;

        int enBuyuk = sayi1;

        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }
        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }
        System.out.println("En büyük sayi: " + enBuyuk);

        char grade = 'D';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel geçntiz.");
                break;
            case 'B':
                System.out.println("Çok güzel geçntiz.");
                break;
            case 'C':
            case 'D':
                System.out.println("Fena değil ya geçntiz.");
                break;
            case 'F':
                System.out.println("Kaldın.");
                break;
            default:
                System.out.println("Geçersiz not girdiniz.");
        }
    }
}
