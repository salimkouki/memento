package commands;


import editor.Editor;
import shapes.Shape;

public class MoveCommand implements Command {
    private Editor editor;
    private int startX, startY;
    private int endX, endY;

    public MoveCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public String getName() {
        return " X: " + (endX - startX) + " Y: " + (endY - startY);
    }

    public void start(int x, int y) {
        startX = x;
        startY = y;
        for (Shape child : editor.getShapes().getSelected()) {
            child.drag();
        }
    }

    public void move(int x, int y) {
        for (Shape child : editor.getShapes().getSelected()) {
            child.moveTo(x - startX, y - startY);
        }
    }

    public void stop(int x, int y) {
        endX = x;
        endY = y;
        for (Shape child : editor.getShapes().getSelected()) {
            child.drop();
        }
    }

    @Override
    public void execute() {
        for (Shape child : editor.getShapes().getSelected()) {
            child.moveBy(endX - startX, endY - startY);
        }
    }    
}
