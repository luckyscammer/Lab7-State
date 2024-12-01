package work7;

/**
 * A concrete implementation of the Tool interface representing a pencil tool.
 */
public class PencilTool implements Tool {

    @Override
    public void onMouseDown(int x, int y) {
        System.out.println("PencilTool: Drawing started at x=" + x + ", y=" + y);
    }

    @Override
    public void onMouseUp(int x, int y) {
        System.out.println("PencilTool: Drawing ended at x=" + x + ", y=" + y);
    }
}

