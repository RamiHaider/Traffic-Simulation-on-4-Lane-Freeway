import java.awt.Color;
import java.awt.Graphics;




public class MIDDLE2 extends Vehicle {

	public MIDDLE2(int newx, int newy) {
		super(newx, newy);
		width = 40;
		height = 20;
		speed = 11;
	}
	
	public void paintMe(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(x, y, width, height);
	}
	
}