package ecamenordinaria.app;

import ecamenordinaria.model.ListProducts;
import ecamenordinaria.model.Product;
import ecamenordinaria.view.ListLoader;
import java.util.ArrayList;
import java.util.List;

public class MockListLoader implements ListLoader{
    private final List<Product> book;
    private final List<Product> supermarket;

    public MockListLoader() {
        Product product1 = new Product("Aliens", "Fiction");
        Product product2 = new Product("El cuaderno de noah", "Romance");
        Product product3 = new Product("Ricitos de oro", "Story");
        book = new ArrayList<>();
        book.add(product1);
        book.add(product2);
        book.add(product3);
        
        Product product4 = new Product("Bed", "Bedroom");
        Product product5 = new Product("Table", "Kitcheb");
        Product product6 = new Product("Toilet paper", "bathroom");
        supermarket = new ArrayList<>();
        supermarket.add(product4);
        supermarket.add(product5);
        supermarket.add(product6);
    }

    @Override
    public ListProducts load(String name) {
        if (name.equals("Supermarket")) {
            return new ListProducts(supermarket, name);
        } else if (name.equals("Book")) {
            return new ListProducts(book, name);
        } else {
            System.out.println("List not found");
            return null;
        }
    }
    
    public List<String> getLists() {
        List<String> lists = new ArrayList<>();
        lists.add("Book");
        lists.add("Supermarked");
        return lists;
    }

    @Override
    public List<String> load(List<String> list) {
        return list;
    }
}
