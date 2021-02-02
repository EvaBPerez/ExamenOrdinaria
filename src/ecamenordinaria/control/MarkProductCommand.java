package ecamenordinaria.control;

import ecamenordinaria.model.ListProducts;
import ecamenordinaria.model.Product;
import ecamenordinaria.view.ListLoader;
import java.util.Scanner;

public class MarkProductCommand implements Command {
    private final String text;
    private final ListLoader listLoader;

    public MarkProductCommand(String text, ListLoader listLoader) {
        this.text = text;
        this.listLoader = listLoader;
    }
    
    @Override
    public void execute() {
        System.out.println("Write " + text + " name");
        Scanner scanner = new Scanner(System.in);
        String prod = scanner.nextLine();
        
        ListProducts list = listLoader.load(text);
        for (Product product : list.getProducts()) {
            if (product.getName().equals(prod)) {
                if (product.getMark()) {
                    product.setMark(false); 
                } else {
                    product.setMark(true);
                }
                System.out.println("\nCorrect mark\n\n");
                break;
            }
        }
    }
}
