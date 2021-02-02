package ecamenordinaria.model;

import java.util.List;

public class ListProducts {
    private final List<Product> products;
    private final String name;

    public ListProducts(List<Product> products, String name) {
        this.products = products;
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }
    
    public void addProduct(Product product) {
        products.add(product);
    }
    
    public void removeProduct(Product product) {
        products.remove(product);
    }

    public String getName() {
        return name;
    }
    
    public List<Product> getList() {
        return products;
    }
}
