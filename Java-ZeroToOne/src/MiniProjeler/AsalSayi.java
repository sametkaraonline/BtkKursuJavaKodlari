package MiniProjeler;

public class AsalSayi {
    public static void main(String[] args) {
        int number = -21;


        boolean asalMi = true;
        if (number==1){
            System.out.println("Sayı asal değildir.");
            return; //Kodu bitirirriz
        }

        if (number<1){
            System.out.println("Geçersiz sayı");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                asalMi = false;
            }
        }

        if (asalMi){
            System.out.println("Sayı asaldır.");
        }else{
            System.out.println("Sayı asal değildir.");
        }
    }
}
