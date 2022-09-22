package oop1;

public class Main {

    public static void main(String[] args) {
        String mesaj = "Vade oranı";

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jpg");


        Product product2 = new Product();
        product2.setName("Tchibo Kahve Makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);
        product2.setImageUrl("image2.jpg");
        //set value


        Product product3 = new Product();
        product3.setName("Smeg Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrl("image3.jpg");
        //set value


        Product[] products = {product1, product2, product3};
        //buradaki değişkenler ve ne ifade ettikleri sorulacak//
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("56464444");
        individualCustomer.setCustomerNumber("12");
        individualCustomer.setFirstName("Engin");
        individualCustomer.setLastName("Demir");
            System.out.println(individualCustomer.getFirstName());
        System.out.println(individualCustomer.getFirstName());



        CorpareteCustomer corpareteCustomer = new CorpareteCustomer();
        corpareteCustomer.setId(2);
        corpareteCustomer.setCompanyName("Kodlama.io");
        corpareteCustomer.setTaxNumber("555-a-789");

        //alttaki satırın mantığı üzerinde dur//
        Customer[] customers = {individualCustomer,corpareteCustomer};
    }
}