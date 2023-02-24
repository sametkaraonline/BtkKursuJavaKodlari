package ObjectOriented.staticDemo;

public class ProductValidator {

    static {
        System.out.println("Static yapıcı blok");
    }

    public ProductValidator() {
        System.out.println("Yapıcı blok çalıştı");
    }


    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public void bisey() {
    }

    //innerClass
    public static class BaskaBirClass{
            public static void Sil(){

            }
}


}

