package repository;
import model.Product;

import java.util.List;

public interface IProductRepository extends IGeneralRepository<Product> {
    List<Product> sortPrice();
}

