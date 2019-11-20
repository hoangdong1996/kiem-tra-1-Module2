package repository;

import model.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ProductRepositoryImpl implements IProductRepository {

    ArrayList<Product> listProducts = new ArrayList<>();

    {
        listProducts.add(new Product(1, "Samsung Galaxy S10", 125000));
        listProducts.add(new Product(2, "Iphone X", 22000));
        listProducts.add(new Product(3, "OPPO", 8000));
        listProducts.add(new Product(4, "NOKIA", 3600));
        listProducts.add(new Product(5, "VSMART PRO", 4800));
    }

    @Override
    public List<Product> findAll() {
        return listProducts;
    }

    @Override
    public void add(Product product) {
        listProducts.add(product);
    }

    @Override
    public void update(int id, Product product) {
        int index = -1;
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getId() == id) {
                index = i;
                break;
            }
        }
        listProducts.set(index, product);
    }

    @Override
    public void remote(int id) {
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getId() == id) {
                listProducts.remove(i);
                return;
            }
        }
    }

    @Override
    public Product findName(String name) {
        for (int i = 0; i <listProducts.size(); i++) {
            if (listProducts.get(i).getName().contains(name)) {
                return listProducts.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Product> sortPrice() {
        Collections.sort(listProducts, new ProductComparatorImpl());
        return listProducts;
    }
}
