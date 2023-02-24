package MiniProjeler;

public class ArkadasSayi {
    public static void main(String[] args) {
        //220 - 284

        int number = 220;
        int number2 = 284;
        int total = 0;
        int total2 = 0;

        for (int i=1; i<number; i++){
            if(number%i == 0){
                total+=i;
            }
        }

        for(int i = 1; i< number2;i++){
            if(number2%i == 0){
                total2+=i;
            }
        }

        if(number == total2 && number2 == total){
            System.out.println("Arkadaş sayılar");
        }else{
            System.out.println("Arkadaş değiller");
        }
    }
}
