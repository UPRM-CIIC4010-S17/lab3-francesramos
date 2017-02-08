	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.Insets;
	import javax.swing.JPanel;
	
public class MyPanelClass extends JPanel{
	
	            /**
	 * 
	 */
	
	private static final long serialVersionUID = 7057541440811488699L;

				public void paintComponent(Graphics g) {
	                        super.paintComponent(g);
	 
	                        //Compute interior coordinates
	                        Insets myInsets = this.getInsets();
	                        int x1 = myInsets.left;
	                        int y1 = myInsets.top;
	                        int x2 = getWidth() - myInsets.right - 1;
	                        int y2 = getHeight() - myInsets.bottom - 1;
	                        int width = x2 - x1;
	                        int height = y2 - y1;
	 
	                        //Paint the background
	                        g.setColor(Color.MAGENTA);
	                        g.fillRect(x1, y1, width + 1, height + 1);
	                        
//	                        //Draw a border
//	                        g.setColor(Color.WHITE);
//	                        g.drawRect(x1, y1, width, height);
//	                        
//	                        //Draw a border inside the other one
//	                        g.setColor(Color.BLACK);
//	                        g.drawRect(x1 + 2,y1 + 2,width, height);
//	                        
//	                        //Draw diagonal line 
//	                        g.setColor(Color.WHITE);
//	                        g.drawLine(x1, y1, x2, y2);
//	                        
//	                        g.setColor(Color.GREEN);
//	                        g.drawLine(x1, y1, x2, y2);
	                        
	                        //Draw Oval
	                        g.setColor(Color.LIGHT_GRAY);
	                        g.fillOval(72, 72, 55, 55);
	                        
	            }

}
