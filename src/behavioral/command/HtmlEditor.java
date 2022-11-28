package src.behavioral.command;

public class HtmlEditor implements Editor{

    @Override
    public void oepn() {
        System.out.println("HtmlEditor open command");
    }

    @Override
    public void close() {
        System.out.println("HtmlEditor close command");
    }

    @Override
    public void delete() {
        System.out.println("HtmlEditor delete command");
    }
}
