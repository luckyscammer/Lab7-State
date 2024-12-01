import work7.*;

/**
 * The main class to demonstrate the graphic editor's tool mechanism.
 */
public class Main {
    /**
     * The main method to run the demonstration.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        Workspace workspace = new Workspace();

        Tool pencil = new PencilTool();
        Tool eraser = new EraserTool();
        Tool selection = new SelectionTool();

        workspace.setTool(pencil);
        workspace.mouseDown(10, 20);
        workspace.mouseUp(30, 40);

        workspace.setTool(eraser);
        workspace.mouseDown(15, 25);
        workspace.mouseUp(35, 45);

        workspace.setTool(selection);
        workspace.mouseDown(5, 10);
        workspace.mouseUp(25, 30);
    }
}
