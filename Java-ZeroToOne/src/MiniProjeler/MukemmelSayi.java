package MiniProjeler;

public class MukemmelSayi {

    public static void main(String[] args) {
        //6,28,
        int number = 28;

        int toplam = 0;
        for (int i=1; i<number; i++){
            if(number%i == 0){
                toplam+=i;
            }
        }

        if (toplam == number){
            System.out.println("Mükemmel Sayıdır");
        }else{
            System.out.println("Mükemmel Sayı değildir.");
        }

    }

}
