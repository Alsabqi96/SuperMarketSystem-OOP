package ObjectOrientedProgramming.SuperMarketSystem.Interfaces;

import ObjectOrientedProgramming.SuperMarketSystem.Entities.Product;

import java.util.List;

public interface ProductInterface {
    Product addProduct();
    Boolean deleteProduct(String sku);
    Product updateProduct(String sku);
    Product getProduct(String sku);
    List<Product> getAllProducts();

}

