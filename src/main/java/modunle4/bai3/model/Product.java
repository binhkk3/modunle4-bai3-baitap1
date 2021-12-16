package modunle4.bai3.model;

public class Product {
    private int id;
    private String  name;
    private int price;
    private String description;
    private String produced;

    public Product() {
    }

    public Product(int id, String name, int price, String description, String produced) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.produced = produced;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProduced() {
        return produced;
    }

    public void setProduced(String produced) {
        this.produced = produced;
    }
}
