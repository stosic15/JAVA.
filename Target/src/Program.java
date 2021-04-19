import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Program extends GraphicsProgram {
	public void run() {
		GOval oval = new GOval(100,100,200, 200);
		add(oval);
		GOval oval1 = new GOval(140,140,125, 125);
		add(oval1);
		GOval oval2 = new GOval(175,175,60,60);
		add(oval2);
		oval.setFilled(true);
		oval1.setFilled(true);
		oval2.setFilled(true);
		oval.setFillColor(Color.RED);
		oval1.setFillColor(Color.WHITE);
		oval2.setFillColor(Color.RED);
	}

}
