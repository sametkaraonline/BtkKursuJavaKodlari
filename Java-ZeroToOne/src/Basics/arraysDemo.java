package Basics;

public class arraysDemo {
    public static void main(String[] args) {
        String ogrenci1 = "Ahmet";
        String ogrenci2 = "Ayse";
        String ogrenci3 = "Samet";
        String ogrenci4 = "Sumeyra";

        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Ahmet";
        ogrenciler[1] = "Ayse";
        ogrenciler[2] = "Sumeyra";

        for(int i=0;i<ogrenciler.length;i++){
            //System.out.println(ogrenciler[i]);
        }

        for(String ogrenci:ogrenciler){
            //System.out.println(ogrenci);
        }

        double[] myList = new double[4];
        double[] myList2 = {1.2,1.3,1.4,1.5};
        double total=0;

        double enBuyuk = myList2[0];

        for(double sayi:myList2){
            if(enBuyuk < sayi){
                enBuyuk = sayi;
            }
            System.out.println(sayi);
            total +=sayi;
        }
        System.out.println(total);
        System.out.println(enBuyuk);

        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Kocaeli";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "x";
        sehirler[1][1] = "c";
        sehirler[1][2] = "s";
        sehirler[2][0] = "a";
        sehirler[2][1] = "a";
        sehirler[2][2] = "f";

        for(int i = 0; i<=2;i++){
            System.out.println("----------------");
            for(int j = 0; j<=2;j++){
                System.out.println(sehirler[i][j]);
            }
        }
    }
}
