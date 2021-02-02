package ecamenordinaria.app;

import ecamenordinaria.control.Command;
import ecamenordinaria.control.LoadListProductCommand;
import ecamenordinaria.control.LoadListsCommand;
import ecamenordinaria.control.NullCommand;
import ecamenordinaria.model.Product;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().execute();
    }

    private MockListDisplay listDisplay;
    private Product product;
    private Map<String, Command> commands;
    private MockListLoader listLoader;
    
    
    private void execute() {
        listDisplay = new MockListDisplay();
        listLoader = new MockListLoader();
        
        Scanner scanner = new Scanner(System.in);
        commands = initCommand();
        
        while (true) {
            System.out.println("[l]oad_lists [e]xit [i]nto");
            commands.getOrDefault(scanner.next(), NullCommand.instance).execute();
        }
    }
    
    private Map<String, Command> initCommand() {
        Map<String, Command> commands = new HashMap<>();
        commands.put("l", new LoadListsCommand(listDisplay, listLoader, listLoader.getLists()));
        commands.put("i", new LoadListProductCommand(listLoader, listDisplay));
        commands.put("e", new Command() {
            @Override
            public void execute() {
                System.exit(0);
            }
        });
        
        return commands;
    }
    
}
