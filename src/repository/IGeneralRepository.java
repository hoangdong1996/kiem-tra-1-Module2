package repository;
import model.Product;

import java.util.List;

public interface IGeneralRepository<E>{
    List<E> findAll();
    void add(E e);
    void update(int id, E e);
    void remote(int id);
    Product findName(String name);
}
