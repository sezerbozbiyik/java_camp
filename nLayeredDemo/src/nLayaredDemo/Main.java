package nLayaredDemo;

import nLayaredDemo.business.abstracts.ProductService;
import nLayaredDemo.business.concretes.ProductManager;
import nLayaredDemo.dataAccess.concretes.AbcProductDao;
import nLayaredDemo.entities.concretes.Product;
import nLayaredDemo.core.JLoggerManagerAdapter;

public class Main {
    public static void main(String[] args) {
        ProductService productService =new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
        Product product1=new Product(1,2,"Elma",1,1);
        productService.add(product1);
    }
}
