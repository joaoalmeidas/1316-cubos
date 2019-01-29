import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Cubo extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		Rectangle2D quadrado1 = new Rectangle2D.Double(100, 100, getWidth() - 200, getWidth() - 200);
		Rectangle2D quadrado2 = new Rectangle2D.Double(quadrado1.getMinX() + 80, quadrado1.getMinY() - 80, quadrado1.getWidth(), quadrado1.getHeight());
		GeneralPath quadrado3 = new GeneralPath();
		
		quadrado3.moveTo(quadrado1.getMinX(), quadrado1.getMinY());
		quadrado3.lineTo(quadrado2.getMinX(), quadrado2.getMinY());
		
		quadrado3.moveTo(quadrado1.getMinX(), quadrado1.getMaxY());
		quadrado3.lineTo(quadrado2.getMinX(), quadrado2.getMaxY());
		
		quadrado3.moveTo(quadrado1.getMaxX(), quadrado1.getMaxY());
		quadrado3.lineTo(quadrado2.getMaxX(), quadrado2.getMaxY());
		
		quadrado3.moveTo(quadrado1.getMaxX(), quadrado1.getMinY());
		quadrado3.lineTo(quadrado2.getMaxX(), quadrado2.getMinY());
		
		
		g2d.draw(quadrado1);
		g2d.draw(quadrado2);
		g2d.draw(quadrado3);
	
	}

}
