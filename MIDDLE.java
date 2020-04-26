import java.awt.Color;
import java.awt.Graphics;


public class MIDDLE extends Vehicle {

	public MIDDLE(int newx, int newy) {
		super(newx, newy);
		width = 18;
		height = 20;
		speed = 12;
	}
	
	public void paintMe(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x, y, width, height);
	}
	
}