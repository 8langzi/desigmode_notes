package src.command;

public class Delete implements Command{

    private Editor editor;

    public Delete(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.delete();
    }

    public Editor getEditor() {
        return editor;
    }

    public void setEditor(Editor editor) {
        this.editor = editor;
    }
}
