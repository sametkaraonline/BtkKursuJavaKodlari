package Basics;

public class Main {

    public static void main(String[] args) {


    int sayi = 10;
    int sayi1 = sayi++; //sayiyi 1 artırıyor,artmadan önceki değer sayi1 e atanır. sayi1 = 10
    int number = sayi++;// sayiyi 1 daha artoır 12, artmadan önceki değer numbera atanmıştı 11

    System.out.println(sayi);
    System.out.println(sayi1);
    System.out.println(number);

    }
}