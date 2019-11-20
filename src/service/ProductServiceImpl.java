package service;

import model.Product;
import repository.ProductRepositoryImpl;

import java.util.List;

public class ProductServiceImpl implements IProductService {

    ProductRepositoryImpl productRepository = new ProductRepositoryImpl();

    @Override
    public List<Product> findAllHaveBusiness() {
        return productRepository.findAll();
    }

    @Override
    public void addHaveBusiness(Product product) {
        productRepository.add(product);
    }

    @Override
    public void updateHaveBusiness(int id, Product product) {
        productRepository.update(id, product);
    }

    @Override
    public void remoteHaveBusiness(int id) {
        productRepository.remote(id);
    }

    @Override
    public Product findNameHaveBusiness(String name) {
        return productRepository.findName(name);
    }

    @Override
    public List<Product> sortPriceHaveBusiness() {
        return productRepository.sortPrice();
    }
}
