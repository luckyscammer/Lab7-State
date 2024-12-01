package work7;

/**
 * Represents a generic tool in a graphic editor.
 */
public interface Tool {

    /**
     * Handles the action when the mouse button is pressed down.
     *
     * @param x The x-coordinate where the mouse is pressed.
     * @param y The y-coordinate where the mouse is pressed.
     */
    void onMouseDown(int x, int y);

    /**
     * Handles the action when the mouse button is released.
     *
     * @param x The x-coordinate where the mouse is released.
     * @param y The y-coordinate where the mouse is released.
     */
    void onMouseUp(int x, int y);
}

