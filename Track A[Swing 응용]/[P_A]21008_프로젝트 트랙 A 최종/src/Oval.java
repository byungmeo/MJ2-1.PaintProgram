import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Oval extends Figure {

	public Oval(int posX, int posY, int width, int height) {
		super(posX, posY, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g2 = (Graphics2D) g;

		g2.setStroke(new BasicStroke(thick)); //두께
		g2.setColor(outColor); //테두리색
		
		g2.drawOval(getX(), getY(), getWidth(), getHeight());
		
		if(fillColor != null) {
			g2.setColor(fillColor);
			g2.fillOval(getX(), getY(), getWidth(), getHeight());
		}
		
		g2.setStroke(new BasicStroke(1));
		g2.setColor(Color.BLACK);
	}

	@Override
	public void relativeDraw(int targetX, int targetY, Graphics g) {
		g2 = (Graphics2D) g;
		
		g2.setStroke(new BasicStroke(thick)); //두께
		g2.setColor(outColor); //테두리색
		
		g2.drawOval(targetX + getX(), targetY + getY(), getWidth(), getHeight());
		
		if(fillColor != null) {
			g2.setColor(fillColor);
			g2.fillOval(targetX + getX(), targetY + getY(), getWidth(), getHeight());
		}
		
		g2.setStroke(new BasicStroke(1));
	}
}
