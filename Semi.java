import java.awt.Color;
import java.awt.Graphics;


public class Semi extends Vehicle {

	public Semi(int newx, int newy) {
		super(newx, newy);
		width = 130;
		height = 40;
		speed = 7;
	}
	
	public void paintMe(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(x, y, width, height);
	}
	
}
