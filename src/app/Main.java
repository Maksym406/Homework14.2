package app;

public class Main {
    public static void main(String[] args) {

        PrinterImpl printer = new PrinterImpl();

        PrinterImpl.Message emptyMessage = new PrinterImpl.Message(null, null);
        printer.print(emptyMessage);

        PrinterImpl.Message anonymousMessage = new PrinterImpl.Message("Привіт всім!", null);
        printer.print(anonymousMessage);

        PrinterImpl.Message userMessage = new PrinterImpl.Message("Привіт, як справи?", "Олександр");
        printer.print(userMessage);
    }
}