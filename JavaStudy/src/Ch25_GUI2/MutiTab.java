package Ch25_GUI2;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

public class MutiTab extends JFrame {
	public MutiTab() {
		super("MutiTab");

		JTabbedPane tabbedPane = new JTabbedPane();

		JLabel Chinese = new JLabel("Chinese", SwingConstants.CENTER);
		JPanel ChinesePanel = new JPanel();
		ChinesePanel.add(Chinese);
		tabbedPane.addTab("Tab Chinese", null, ChinesePanel, "test");
		
	
		add(tabbedPane);

	}

	public void paintComponent(Graphics g) {
		//JPanel canvas=new JPanel();
		//super.paintComponent(g);
		int radius=51;

		g.drawOval(50, 50, radius * 2, radius * 2);
		Graphics2D g2d = (Graphics2D) g;
		g2d.draw(new Ellipse2D.Double(150, 100, radius, radius));
		repaint();
		
		
	}
}
