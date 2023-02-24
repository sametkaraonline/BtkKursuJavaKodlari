package Collections.hashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String,String> sozluk = new HashMap<String,String>();

        sozluk.put("book","kitap");
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisayar");

        //sozluk.remove("table");

        //System.out.println(sozluk.get("kk"));

        for (String eleman:sozluk.keySet()) {
            System.out.println(eleman);
        }
        for (String eleman:sozluk.keySet()) {
            System.out.println("Eleman - "+eleman+" Değer-"+sozluk.get("sa"));
        }

    }

}
