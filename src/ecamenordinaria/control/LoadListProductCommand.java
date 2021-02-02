package ecamenordinaria.control;

import ecamenordinaria.view.ListDisplay;
import ecamenordinaria.view.ListLoader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoadListProductCommand implements Command{

    private final ListLoader listLoader;
    private final ListDisplay listDisplay;
    private Map<String, Command> commands;
    private String text;

    public LoadListProductCommand(ListLoader listLoader, ListDisplay listDisplay) {
        this.listLoader = listLoader;
        this.listDisplay = listDisplay;
    }
    
    @Override
    public void execute() {
        System.out.println("Write list");
        Scanner scanner = new Scanner(System.in);
        text = scanner.next();
        commands = initCommand();
        
        while (true) {
            listDisplay.display(listLoader.load(text));
            System.out.println("[r]emove [a]dd [m]ark [e]xit");
            commands.getOrDefault(scanner.next(), NullCommand.instance).execute();
        }
    }
    
    private Map<String, Command> initCommand() {
        Map<String, Command> commands = new HashMap<>();
        commands.put("a",new AddProductCommand(text, listLoader));
        commands.put("r",new RemoveProductCommand(listLoader, text));
        commands.put("m",new MarkProductCommand(text, listLoader));
        commands.put("e", new Command() {
            @Override
            public void execute() {
                System.exit(0);
            }
        });
        
        return commands;
    }

}
