package ecamenordinaria.control;

public class NullCommand implements Command {
    public static final Command instance = new NullCommand();

    @Override
    public void execute() {}
}
