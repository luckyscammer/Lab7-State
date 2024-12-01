package work7;

/**
 * A concrete implementation of the Tool interface representing a selection tool.
 */
public class SelectionTool implements Tool {

    @Override
    public void onMouseDown(int x, int y) {
        System.out.println("SelectionTool: Selection started at x=" + x + ", y=" + y);
    }

    @Override
    public void onMouseUp(int x, int y) {
        System.out.println("SelectionTool: Selection ended at x=" + x + ", y=" + y);
    }
}

