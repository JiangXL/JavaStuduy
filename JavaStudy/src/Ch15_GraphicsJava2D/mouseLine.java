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
				// repaint �����µ���paintComponent����
				/*
				 * ?�ѵ����ʹ�ģ���������塢�����ʵ����һ���� 
				 * ������Ҫ�ֱ��2����ܻ���һ���ߣ�����ʵ����ҷ�Ĺ��� ���Ҳ��һ��
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
		  g2d.setStroke(new BasicStroke(5.0f));   //���û��ʴ�ϸ
	      g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // �������
		for (int i = 0; i < count; i = i + 2) {
			System.out.println(i);
			g2d.drawLine(points[i].x, points[i].y, points[i + 1].x, points[i + 1].y);

		}
	}
}
