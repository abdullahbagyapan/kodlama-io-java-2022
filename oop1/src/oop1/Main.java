package oop1;

public class Main {

    public static void main(String[] args) {
        
        Product product = new Product();

        product.setName("Lenovo Thinkpad");
        product.setUnitPrice(350);
        product.setDiscount(10);
        product.setUnitsInStock(50);
        product.setImageUrl("productImage/lenovo-thinkpad");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setName("Customer");
        individualCustomer.setPhoneNumber("0300");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setCompanyName("Lenovo");
        corporateCustomer.setId(1);
        corporateCustomer.setPhoneNumber("0301");
        corporateCustomer.setTaxNumber("1111111");


        Customer[] customers = {individualCustomer,corporateCustomer};
        
    }
    
}
