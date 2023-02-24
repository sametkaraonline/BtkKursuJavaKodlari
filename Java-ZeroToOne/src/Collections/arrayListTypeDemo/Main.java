package Collections.arrayListTypeDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler =new ArrayList<String>();

        sehirler.add("Ankara");
        sehirler.add("Istanbul");
        sehirler.add("Izmir");
        sehirler.add("Trabzon");
        sehirler.add("Aydın");

        sehirler.remove(0);
        sehirler.remove("Izmir");

        Collections.sort(sehirler);

        for (String sehir: sehirler){
            System.out.println(sehir);
        }

    }

}
