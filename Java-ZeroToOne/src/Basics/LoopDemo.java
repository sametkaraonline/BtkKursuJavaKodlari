package Basics;

public class LoopDemo {
    public static void main(String[] args) {


        for(int i =1;i<=10;i+=2){
            System.out.println(
                    i
            );
        }


        int i = 4;

        while(i<10){
            System.out.println(i);
            i++;
        }

        System.out.println("-----------------------");
        int j = 4;
        do{
            //System.out.println("loglandı");
            System.out.println(j);
            j++;
        }while (j<10);
    }
}
