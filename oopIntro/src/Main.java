public class Main {
    public static void main(String[] args) throws Exception {

        Product product1 = new Product(1,"Lenovo V14","16 GB Ram",13500,10);

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("HP");
        product2.setDetail("8 GB Ram");
        product2.setUnitPrice(15000);
        product2.setDiscount(10);

        System.out.println(product1.getUnitPriceAfterDiscount());
        System.out.println(product2.getUnitPriceAfterDiscount());
        
        ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);
        productManager.addToCart(product2);

        Product[] products = {product1,product2};

        System.out.println(products.length);

        System.out.println("----------------");
        
        Category category1 = new Category();
        category1.setId(1);
        category1.setName("Bilgisayar");

        Category category2 = new Category();
        category2.setId(2);
        category2.setName("Ev/Bahçe");

        System.out.println(category1.getName());
        System.out.println(category2.getName());
        
    }
}
