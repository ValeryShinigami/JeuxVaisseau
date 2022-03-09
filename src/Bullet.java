
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class Bullet {
	
	private double x;
	private double y;
	private int r;
	
	private double dx;
	private double dy;
	private double rad;
	private float speed;
	
	private Color color1;
	
	//constructor
	public Bullet(float angle, int x, int y) {
		this.x = x;
		this.y = y;
		rad = Math.toRadians(angle);
		dx = Math.cos(rad);
		dy = Math.sin(rad);
		speed = 15;
		
		color1 = Color.yellow;
		
	}
	
	//functions
	public boolean update() {
		
		x += dx;
		y += dy;
		
		
		if(x < -r || x > 800 + r || y < -r || y > 532 + r  ) {
			return true;
			
		}
		return false;
		
	}
	
	public void draw(Graphics g) {
		
		g.setColor(color1);
		g.fillOval( (int) (x-r), (int) (y-r), 2 * r, r);
		
	}

	
	
}
