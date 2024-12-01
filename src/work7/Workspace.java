package work7;

/**
 * Represents the workspace in a graphic editor where drawing occurs.
 * It maintains the current tool and delegates mouse actions to it.
 */
public class Workspace {

    /**
     * The currently selected tool.
     */
    private Tool currentTool;

    /**
     * Sets the current tool to the specified tool.
     *
     * @param tool The tool to be set as the current tool.
     */
    public void setTool(Tool tool) {
        this.currentTool = tool;
        System.out.println("Tool changed to " + tool.getClass().getSimpleName());
    }

    /**
     * Simulates the action when the mouse button is pressed down.
     *
     * @param x The x-coordinate where the mouse is pressed.
     * @param y The y-coordinate where the mouse is pressed.
     */
    public void mouseDown(int x, int y) {
        if (currentTool != null) {
            currentTool.onMouseDown(x, y);
        } else {
            System.out.println("No tool selected.");
        }
    }

    /**
     * Simulates the action when the mouse button is released.
     *
     * @param x The x-coordinate where the mouse is released.
     * @param y The y-coordinate where the mouse is released.
     */
    public void mouseUp(int x, int y) {
        if (currentTool != null) {
            currentTool.onMouseUp(x, y);
        } else {
            System.out.println("No tool selected.");
        }
    }
}

