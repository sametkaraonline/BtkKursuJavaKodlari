package ObjectOriented.ClassesWithAtributes;

public class Main {
    public static void main(String[] args) {

    Product product = new Product(1,   "Laptop","Asus",11111,2,"siyah");


    ProductManager productManager = new ProductManager();
    productManager.Add(product);

    productManager.Add2(1,"asd"," ",2,2);

    System.out.println(product.getName());
    }
}
