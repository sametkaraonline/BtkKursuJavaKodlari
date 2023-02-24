package ObjectOriented.interfaces;

public class CustomerManager {

/* 1. yöntem, unutulabiliyor
    ICustomerDal customerDal;

    public void Add(){
        // iş kodları
        customerDal.Add();
    }
*/
    //  constructırla bu şekilde verilmeden kullanılamaz hale getiriyor. constructırla
    private  ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }

    public void Add(){
        // iş kodları
        customerDal.Add();
    }




}
