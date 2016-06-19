package Ch25_GUI2;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;

public class menus extends JFrame {
	private JRadioButtonMenuItem[] changeItems;
	private ButtonGroup changeGroup;
	private JTextField input;
	private JTextField output;
	private JLabel showinput;
	private JLabel showout;
	private JPanel panel;

	public menus() {
		super("Switch Demo");
		// create program menu
		JMenu fileMenu = new JMenu("Program");
		fileMenu.setMnemonic('P');
		JMenuItem aboutItem = new JMenuItem("About");
		fileMenu.add(aboutItem);
		aboutItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(menus.this, "Java Program to get decimal nubmer", "About",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		JMenuItem exitItem = new JMenuItem("exit");
		fileMenu.add(exitItem);
		exitItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		// end program menu

		JMenu changeMenu = new JMenu("Change");
		changeMenu.setMnemonic('C');
		String[] change = { "2->10", "16->10", "18->10" };
		changeItems = new JRadioButtonMenuItem[change.length];
		ItemHandler itemHandler = new ItemHandler();
		changeGroup = new ButtonGroup();
		for (int i = 0; i < change.length; i++) {
			changeItems[i] = new JRadioButtonMenuItem(change[i]);
			changeMenu.add(changeItems[i]);
			changeGroup.add(changeItems[i]);
			changeItems[i].addActionListener(itemHandler);
		}

		panel = new JPanel();
		input = new JTextField();
		output = new JTextField();
		panel.add(input);
		panel.add(output);

		JMenuBar bar = new JMenuBar();
		setJMenuBar(bar);
		bar.add(fileMenu);
		bar.add(changeMenu);

	}

	private class ItemHandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			/*
			 * if(){
			 * 
			 * } else if(){
			 * 
			 * } else{
			 * 
			 * }
			 */

		}
	}

}
