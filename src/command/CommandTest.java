package src.command;

public class CommandTest {

    public static void main(String[] args) {
        Editor editor = new HtmlEditor();
        Command open = new Open(editor);
        Command close = new Close(editor);
        Command delete = new Delete(editor);
        open.execute();
        close.execute();
        delete.execute();
    }

}
