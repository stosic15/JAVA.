import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class TicTac extends GraphicsProgram {
	public void run() {
		
		add (new GLine(BOARD_SIZE, BOARD_SIZE1, BOARD_SIZE3, BOARD_SIZE1));
		add (new GLine(BOARD_SIZE, BOARD_SIZE2, BOARD_SIZE3,BOARD_SIZE2));
		add (new GLine(BOARD_SIZE1, BOARD_SIZE, BOARD_SIZE1, BOARD_SIZE3));
		add (new GLine(BOARD_SIZE2, BOARD_SIZE, BOARD_SIZE2, BOARD_SIZE3));
	}
	private static final double BOARD_SIZE = 120;
	private static final double BOARD_SIZE1 = 240;
	private static final double BOARD_SIZE2 = 360;
	private static final double BOARD_SIZE3 = 480;

}
//Chapter 3 exercise 10