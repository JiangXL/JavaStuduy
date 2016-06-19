package Ch15_GraphicsJava2D;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JLabel;

public class ControlCircle extends JFrame {
	private JButton jbtEnlarge = new JButton("Enlarge");
	private JButton jbtShrink = new JButton("Shrink");
	private CirclePanel canvas = new CirclePanel();
	private JSlider diameterJSlider;
	private JLabel showdiameter;

	public ControlCircle() {
		JPanel panel = new JPanel(); // Use the panel to group buttons
		JLabel showdiameter=new JLabel();
		panel.add(jbtEnlarge);
		panel.add(jbtShrink);
		panel.add(showdiameter);

		jbtEnlarge.addActionListener(new Listener());
		jbtShrink.addActionListener(new Listener());
		getContentPane().add(panel,BorderLayout.SOUTH); // Add buttons to the frame
		// create JSlider to use

		diameterJSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 50);
		diameterJSlider.setMajorTickSpacing(10);
		diameterJSlider.setPaintTicks(true);
		diameterJSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent h) {
				canvas.setdiameter(diameterJSlider.getValue());
				showdiameter.setText(""+diameterJSlider.getValue());
			}
		});
		getContentPane().add(diameterJSlider, BorderLayout.NORTH);
		// add JSlider to frame

		getContentPane().add(canvas, BorderLayout.CENTER); // Add canvas to center

	}

	/** Main method */
	public static void main(String[] args) {
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

	class CirclePanel extends JPanel {

		private int radius = 50; // Default circle radius

		public void setdiameter(int r) {
			radius = r;
			repaint();
		}

		/** Enlarge the circle */
		public void enlarge() {
			radius++;
			repaint();

		}

		/** Enlarge the circle */
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
