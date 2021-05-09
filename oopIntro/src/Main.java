public class Main {
    public static void main(String[] args) throws Exception {

        Product product1 = new Product(1,"Lenovo V14","16 GB Ram",15,1500); // referans yaratma

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("HP");
        
        Category category1 = new Category();
        category1.setId(1);
        category1.setName("Bilgisayar");

        Category category2 = new Category();
        category2.setId(2);
        category2.setName("Ev/Bahçe");

        ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);
        productManager.addToCart(product2);

        Product[] products = {product1,product2};

        System.out.println(products.length);
    }
}
