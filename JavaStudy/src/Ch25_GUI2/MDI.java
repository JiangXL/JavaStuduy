package Ch25_GUI2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MDI extends JFrame {

	private JDesktopPane theDesktop;

	public MDI() {
		super("DesktopTest");
		JMenuBar Bar = new JMenuBar();
		JMenu Menus = new JMenu("File");
		JMenuItem JColorChoose = new JMenuItem("JColorChoose");
		JMenuItem JColorChooseWindows = new JMenuItem("JColorChooseWindows");
		JMenuItem circle = new JMenuItem("MagicCircle");
		Bar.add(Menus);
		Menus.add(circle);
		Menus.add(JColorChoose);
		Menus.add(JColorChooseWindows);
		theDesktop = new JDesktopPane();
		add(theDesktop);
		setJMenuBar(Bar);
		JColorChoose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JInternalFrame interframe = new JInternalFrame("JColorChoose", true, true, true, true);
				// Title,resize,option
				MDI_ColorChoosePanel colorPanel=new MDI_ColorChoosePanel();
				interframe.add(colorPanel, BorderLayout.CENTER);
				interframe.pack();
				theDesktop.add(interframe);
				interframe.setVisible(true);
				/*
				 * When you put a panel in JInternalFrame ,JInternalFrame will
				 * show it, But JButton don't work!
				 *Possible change JFrame to JInternalFrame£¿
				 */
			}
		});
		JColorChooseWindows.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JColorChoose app = new JColorChoose();
				 /* if it is window it will be window outside the main frame even
				 * if you write it in JInternalFrame If you do that,Eclipse will
				 * show error in Console
				 */
			}
		});
/*		circle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evet) {

				JInternalFrame frame = new JInternalFrame("circel", true, true, true, true);
				CirclePanel app = new CirclePanel();
				frame.add(app, BorderLayout.CENTER);
				frame.pack();
				frame.setVisible(true);
				theDesktop.add(frame);
				System.out.println("test");

			}
		});*/

	}

}
/*

class CirclePanel extends JPanel {

	private JButton jbtEnlarge = new JButton("Enlarge");
	private JButton jbtShrink = new JButton("Shrink");
	private CirclePanel canvas = new CirclePanel();
	private JSlider diameterJSlider;
	private JLabel showdiameter;
	public CirclePanel(){
	JPanel panel = new JPanel(); // Use the panel to group buttons
	
	panel.add(jbtEnlarge);
	panel.add(jbtShrink);
	jbtEnlarge.addActionListener(new Listener());
	jbtShrink.addActionListener(new Listener());
	this.add(panel, BorderLayout.SOUTH); // Add buttons to the frame
	//create JSlider to use
	
	diameterJSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 50);
	diameterJSlider.setMajorTickSpacing(10);
	diameterJSlider.setPaintTicks(true);
	diameterJSlider.addChangeListener(new ChangeListener() {
		public void stateChanged(ChangeEvent h) {

			
			canvas.setdiameter(diameterJSlider.getValue());
		}
	});
	this.add(diameterJSlider, BorderLayout.NORTH);
	//add JSlider to frame
	
	this.add(canvas, BorderLayout.CENTER); // Add canvas to center

}
	private int radius = 50; // Default circle radius

	public void setdiameter(int r) {
		radius = r;
		repaint();
	}

	/** Enlarge the circle 
	public void enlarge() {
		radius++;
		repaint();

	}

	/** Enlarge the circle 
	public void shrink() {
		radius--;
		repaint();
	

	}

	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawOval(50, 50, radius * 2, radius * 2);
		Graphics2D g2d = (Graphics2D) g;
		g2d.draw(new Ellipse2D.Double(150, 100, radius, radius));
	}
}
}
	JFrame frame = new ControlCircle();
	frame.setTitle("ControlCircle2");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(400, 400);
	frame.setVisible(true);
}


// create Listener
class Listener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbtEnlarge) {
			canvas.enlarge();
		} else if (e.getSource() == jbtShrink) {
			canvas.shrink();
		}

	}

}
*/
