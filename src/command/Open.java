package src.command;

public class Open implements Command{

    private Editor editor;

    public Open(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.oepn();
    }

    public Editor getEditor() {
        return editor;
    }

    public void setEditor(Editor editor) {
        this.editor = editor;
    }
}
