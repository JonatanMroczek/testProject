public class ConsoleMessage extends Message{

    @Override
    protected String getMessage() {
        return "This is class " + this.getClass().getSimpleName();
    }
}



