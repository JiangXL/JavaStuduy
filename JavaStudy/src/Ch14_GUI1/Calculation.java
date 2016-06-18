package Ch14_GUI1;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculation extends JFrame {

	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button0;
	private JButton buttonadd;
	private JButton buttond;
	private JButton buttondevie;
	private JButton buttonminus;
	private JTextField showboard;
	private JPanel Panel;
	private JPanel Paneltext;
	private GridLayout grid;

	public Calculation() {
		super("Easy Calculation");
		setLocationRelativeTo(null);
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		button0 = new JButton("0");
		buttonadd = new JButton("+");
		buttond = new JButton("*");
		buttonminus = new JButton("-");
		buttondevie = new JButton("/");
		Panel = new JPanel();
		Paneltext = new JPanel();
		
		
		grid =new GridLayout(5, 5);
		showboard = new JTextField(55);
		showboard.setSize(200, 6000);
		//setSize don't work
		grid.addLayoutComponent("", showboard);
		Panel.setLayout(grid);
		add(Panel);
		Paneltext.add(showboard);
		add(Paneltext,BorderLayout.NORTH);
		
		Panel.add(button1);
		Panel.add(button2);
		Panel.add(button3);
		Panel.add(button4);
		Panel.add(button5);
		Panel.add(button6);
		Panel.add(button7);
		Panel.add(button8);
		Panel.add(button9);
		Panel.add(button0);
		Panel.add(buttonadd);
		Panel.add(buttond);
		Panel.add(buttonminus);
		Panel.add(buttondevie);

	}

}
