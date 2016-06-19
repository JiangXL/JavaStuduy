package Ch15_GraphicsJava2D;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class mouseLine extends JPanel {
	private int count = 0;
	private Point[] points = new Point[10000];

	public mouseLine() {
		addMouseListener(new MouseAdapter() {
			
			
			//get begin point 
			public void mousePressed(MouseEvent e) {
				points[count] = e.getPoint();
				count++;
				
			}
			public void mouseReleased(MouseEvent e) {
				points[count] = e.getPoint();
				count++;
				repaint();
				//get end point 
				// repaint 会重新调用paintComponent方法
				/*
				 * ?难道鼠标和触模屏、触摸板、触摸笔的命令不一样？ 
				 * 现在需要分别点2点才能画出一条线，不能实现拖曳的功能 鼠标也是一样
				 *A:mousePress not used
				 *A:"mousePressed"-->"mousePress",so......
				 **/
				
			}
			
			
		

		});
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;
		  g2d.setStroke(new BasicStroke(5.0f));   //设置画笔粗细
	      g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // 消除锯齿
		for (int i = 0; i < count; i = i + 2) {
			System.out.println(i);
			g2d.drawLine(points[i].x, points[i].y, points[i + 1].x, points[i + 1].y);

		}
	}
}
