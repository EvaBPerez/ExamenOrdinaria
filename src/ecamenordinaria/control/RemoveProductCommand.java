package ecamenordinaria.control;

import ecamenordinaria.model.ListProducts;
import ecamenordinaria.model.Product;
import ecamenordinaria.view.ListLoader;
import java.util.Scanner;

public class RemoveProductCommand implements Command {
    private final ListLoader listLoader;
    private final String text;

    public RemoveProductCommand(ListLoader listLoader, String text) {
        this.listLoader = listLoader;
        this.text = text;
    }

    
    @Override
    public void execute() {
        System.out.println("Write " + text + " name");
        Scanner scanner = new Scanner(System.in);
        String prod = scanner.nextLine();
        
        ListProducts list = listLoader.load(text);
        for (Product product : list.getProducts()) {
            if (product.getName().equals(prod)) {
                list.removeProduct(product);
                System.out.println("\nCorrect remove\n\n");
                break;
            }
        }
    }
}
