package service;

import model.Product;

import java.util.List;

public interface IGeneralService<E> {
    List<E> findAllHaveBusiness();

    void addHaveBusiness(E e);

    void updateHaveBusiness(int id, E e);

    void remoteHaveBusiness(int id);

    Product findNameHaveBusiness(String name);
}
