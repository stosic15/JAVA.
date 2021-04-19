import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Program extends GraphicsProgram {
	public void run() {
		GRect rect = new GRect(100, 50, 150, 240 );
		add(rect);
		GOval oval = new GOval(120,80,30, 30);
		add(oval);
		GOval oval1 = new GOval(200,80,30, 30);
		add(oval1);
		GRect rect1 = new GRect(170,170,10, 20);
		add(rect1);
		GRect rect2 = new GRect(125,230,95, 25);
		add(rect2);
		oval.setFilled(true);
		oval.setFillColor(Color.ORANGE);
		oval1.setFilled(true);
		oval1.setFillColor(Color.ORANGE);
		rect1.setFilled(true);
		rect.setFilled(true);
		rect.setFillColor(Color.GRAY);
		rect2.setFilled(true);
		rect2.setFillColor(Color.WHITE);
		
	}

}
