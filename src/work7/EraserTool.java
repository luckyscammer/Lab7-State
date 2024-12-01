package work7;

/**
 * A concrete implementation of the Tool interface representing an eraser tool.
 */
public class EraserTool implements Tool {

    @Override
    public void onMouseDown(int x, int y) {
        System.out.println("EraserTool: Erasing started at x=" + x + ", y=" + y);
    }

    @Override
    public void onMouseUp(int x, int y) {
        System.out.println("EraserTool: Erasing ended at x=" + x + ", y=" + y);
    }
}

