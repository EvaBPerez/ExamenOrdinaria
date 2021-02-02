package ecamenordinaria.control;

import ecamenordinaria.view.ListDisplay;
import ecamenordinaria.view.ListLoader;
import java.util.List;

public class LoadListsCommand implements Command {

    private final ListDisplay listDisplay;
    private final ListLoader listLoader;
    private final List<String> lists;

    public LoadListsCommand(ListDisplay listDisplay, ListLoader listLoader, List<String> lists) {
        this.listDisplay = listDisplay;
        this.listLoader = listLoader;
        this.lists = lists;
    }

    @Override
    public void execute() {
        listDisplay.display(listLoader.load(lists));
    }

}
