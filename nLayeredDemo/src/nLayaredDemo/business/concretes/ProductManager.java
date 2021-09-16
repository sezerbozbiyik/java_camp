package nLayaredDemo.business.concretes;

import nLayaredDemo.business.abstracts.ProductService;
import nLayaredDemo.core.LoggerService;
import nLayaredDemo.dataAccess.abstracts.ProductDao;
import nLayaredDemo.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {
    ProductDao productDao;
    LoggerService loggerService;

    public ProductManager(ProductDao productDao,LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService=loggerService;
    }

    @Override
    public void add(Product product) {
        if (product.getCategoryId() == 1) {
            System.out.println("Bu kategoride ürün kabul edilmiyor");
            return;
        }
        productDao.add(product);
        loggerService.logToSystem("Ürün eklendi : "+product.getName());
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
