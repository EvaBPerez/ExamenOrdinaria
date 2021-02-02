package ecamenordinaria.control;

import ecamenordinaria.model.ListProducts;
import ecamenordinaria.model.Product;
import ecamenordinaria.view.ListLoader;
import java.util.Scanner;

public class AddProductCommand implements Command {

    private final String text;
    private final ListLoader listLoader;

    public AddProductCommand(String text, ListLoader listLoader) {
        this.text = text;
        this.listLoader = listLoader;
    }
    
    @Override
    public void execute() {
        System.out.println("product \"into\" category");
        Scanner scanner = new Scanner(System.in);
        String prod = scanner.nextLine();
        String category = scanner.nextLine();
        
        System.out.println(text);
        ListProducts list = listLoader.load(text);
        list.addProduct(new Product(prod, category));
        System.out.println("\nCorrect remove\n\n");
    }
}
