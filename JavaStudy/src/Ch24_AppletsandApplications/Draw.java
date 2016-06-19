package Ch24_AppletsandApplications;

import java.awt.BorderLayout;			
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Draw extends JApplet {

	private int flag; // sum of values entered by user
	private int radius = 50;

	private JRadioButton circleButton;
	private JRadioButton RectButton;
	private JRadioButton OvalButton;
	private ButtonGroup BtGroup;
	private JPanel BtPanel;

	public void init() {
		//System.out.println("init");
		setLayout(new BorderLayout());
		circleButton = new JRadioButton("Circle", true);
		RectButton = new JRadioButton("Rectangel", false);
		OvalButton = new JRadioButton("Oval", false);
		BtGroup = new ButtonGroup();
		BtGroup.add(circleButton);
		BtGroup.add(RectButton);
		BtGroup.add(OvalButton);

		circleButton.addActionListener(new Listener());
		RectButton.addActionListener(new Listener());
		OvalButton.addActionListener(new Listener());

		BtPanel = new JPanel();
		BtPanel.setLayout(new GridLayout(1, 3));
		BtPanel.add(circleButton);
		BtPanel.add(RectButton);
		BtPanel.add(OvalButton);

		add(BtPanel, BorderLayout.SOUTH);
	} // end method init



	public void paint(Graphics g) {
		super.paint(g);	
		
		if (flag == 1) {
			g.drawOval(getWidth() / 2 - radius, getHeight() / 2 - radius,
					2 * radius, 2 * radius);
		} else if (flag == 2) {
			g.drawRect(getWidth() / 2 - radius, getHeight() / 2 - radius,
					2 * radius, 2 * radius);
		} else if (flag == 3) {
			g.drawOval(getWidth() / 2 - 2 * radius, getHeight() / 2 - radius,
					4 * radius, 2 * radius);
		}
	} 
	
    public void destroy() {
        remove(BtPanel);
    }

	class Listener implements ActionListener 
	{
		public void actionPerformed(ActionEvent event) {
			if (circleButton.isSelected()) {
				flag = 1;
				repaint();
			} else if (RectButton.isSelected()) {
				flag = 2;
				repaint();
			} else if (OvalButton.isSelected()) {
				flag = 3;
				repaint();
			}
		}
	}
}
