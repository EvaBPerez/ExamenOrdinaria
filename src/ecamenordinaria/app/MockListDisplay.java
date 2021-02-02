package ecamenordinaria.app;

import ecamenordinaria.model.ListProducts;
import ecamenordinaria.model.Product;
import ecamenordinaria.view.ListDisplay;
import java.util.List;

public class MockListDisplay implements ListDisplay{

    @Override
    public void display(ListProducts list) {
        System.out.println(list.getName() + ": ");
        System.out.println("-------------------------");
        for (Product product : list.getList()) {
            if (product.getMark()) {
                System.out.println("[*] " + product.getName() + " (" + product.getCategory() + ") ");
            } else {
                System.out.println(product.getName() + " (" + product.getCategory() + ") ");
            }
        }
    }

    @Override
    public void display(List<String> list) {
        System.out.println(list);        
    }

}
