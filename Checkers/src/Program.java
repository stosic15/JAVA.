import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Program extends GraphicsProgram {
 public void run() {
	 double fieldSize = getHeight() / ROWS;
	 double fieldWidth = COLUMNS * fieldSize;
	 for(int i = 0; i < ROWS; i++) {
		 for(int j = 0; j < COLUMNS; j++) {
			 double x = i * fieldSize;
			 double y = j * fieldSize;
			 GRect board = new GRect(x, y, fieldSize, fieldSize);
			 board.setFilled((i + j) % 2 != 0);
			 board.setColor(Color.gray);
			 add(board);
			 
			 for (int l = 0; l < 3; l++) { 
                 for (int m = 0; m < COLUMNS; m++) { 
                     double p = (m * fieldSize) + (getWidth() / 2 - fieldWidth / 2); 
                     double s = (l * fieldSize) + (getHeight() / 2 - fieldWidth / 2); 
                        GOval ov = new GOval(p, s, fieldSize, fieldSize); 
                        ov.setFilled((l+m) % 2 != 0);
                        ov.setFillColor(Color.RED); 
                        add(ov); 
            
                 } 
             } 
			 for (int n = 5; n < ROWS; n++) { 
                 for (int o = 0; o < COLUMNS; o++) { 
                     double t = (o * fieldSize) + (getWidth() / 2 - fieldWidth / 2); 
                     double a = (n * fieldSize) + (getHeight() / 2 - fieldWidth/ 2);
                     GOval ovl = new GOval(t, a, fieldSize, fieldSize); 
                     ovl.setFilled((n+o) % 2 != 0);
                     ovl.setFillColor(Color.BLACK); 
                     add(ovl);
                 }
		 }
	 }
	 
	 }
   }
 private static final int ROWS = 8;
 private static final int COLUMNS = 8;
 }
//Chapter 4 exercise 14