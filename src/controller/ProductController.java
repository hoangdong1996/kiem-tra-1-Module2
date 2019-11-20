package controller;

import model.Product;
import service.ProductServiceImpl;

import java.util.List;

public class ProductController {
    ProductServiceImpl productService = new ProductServiceImpl();

    public List<Product> getProducts() {
        return productService.findAllHaveBusiness();
    }

    public void addProduct(Product product) {
        productService.addHaveBusiness(product);
    }

    public void updateProduct(int id, Product product) {
        productService.updateHaveBusiness(id, product);
    }

    public void remoteProduct(int id) {
        productService.remoteHaveBusiness(id);
    }

    public Product findName(String name) {
        return productService.findNameHaveBusiness(name);
    }
    public List<Product> sortPrice() {
        return productService.sortPriceHaveBusiness();
    }

}
