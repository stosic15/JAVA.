import java.awt.Color;

import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class House extends GraphicsProgram {
	public void run() {
		GRect rect = new GRect(100, 100,200, 100);
		add(rect);
		GRect rect1 = new GRect(180,135,35,65);
		add(rect1);
		GRect rect2 = new GRect(120, 120, 40, 40 );
		add(rect2);
		GRect rect3 = new GRect(240, 120, 40, 40 );
		add(rect3);
		GOval oval = new GOval(205,162,8, 8);
		add(oval);
		GLine line = new GLine(100, 100, 200, 50);
		add(line);
		GLine line1 = new GLine(300, 100, 200, 50);
		add(line1);
	}

}
