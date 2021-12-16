package modunle4.bai3.service;

import modunle4.bai3.model.Product;

import java.util.List;

public interface IProductSevice {
    List<Product> findall();
void save(Product product);
Product findById(int id);
void update(int id , Product product);
void remove (int id);
}
