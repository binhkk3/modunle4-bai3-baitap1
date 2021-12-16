package modunle4.bai3.service;

import modunle4.bai3.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductSevice {
    private static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"dien thoạiak1",634785,"hang zin","chua te dien thoại"));
        products.put(2,new Product(2,"dien may ",87654,"hang gan zin","te dien"));
        products.put(3,new Product(3,"thoại",30986,"hang sap zin","chua  thoại"));
        products.put(4,new Product(4,"dien tu",74542,"hang hoi zin","chua te no"));
        products.put(5,new Product(5,"may bay",3462,"hang nguyen khong zin","ba hoang dien thoại"));
        products.put(6,new Product(6,"tau vu tru",3464232,"hang het zin","ong to an trom"));
        products.put(7,new Product(7,"bom hat nhan",34234322,"hang mai  zin","chua te an cap"));

    }

    @Override
    public List<Product> findall() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
products.remove(id);
    }
}
