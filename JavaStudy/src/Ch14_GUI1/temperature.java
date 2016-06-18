package Ch14_GUI1;

import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;

public class temperature extends JFrame {

	private JPanel sourcepanel;
	private JPanel resultpanel;

	private JLabel F;
	private JLabel K;
	private JLabel C;

	private JTextField sourcetext;
	private JTextField resulttext;

	private JRadioButton sourceC;
	private JRadioButton sourceF;
	private JRadioButton sourceK;
	private JRadioButton resultC;
	private JRadioButton resultF;
	private JRadioButton resultK;
	private ButtonGroup sourceButton;
	private ButtonGroup resultButton;

	public temperature() {
		super("C<>F<>K");
		setLocationRelativeTo(null);

		sourcepanel = new JPanel();
		resultpanel = new JPanel();
		sourcetext = new JTextField(10);
		add(sourcetext);
		sourcetext.addActionListener(null);
		setLayout(new FlowLayout());

		sourceC = new JRadioButton("°„C", true);
		sourceF = new JRadioButton("°„F", false);
		sourceK = new JRadioButton("K", false);

		sourcepanel.add(sourceC);
		sourcepanel.add(sourceF);
		sourcepanel.add(sourceK);

		sourceButton = new ButtonGroup();
		sourceButton.add(sourceC);
		sourceButton.add(sourceF);
		sourceButton.add(sourceK);

		add(sourcepanel);

		resulttext = new JTextField(10);

		resulttext.setEditable(false);
		;
		resultC = new JRadioButton("°„C", false);
		resultF = new JRadioButton("°„F", true);
		resultK = new JRadioButton("K", false);

		resultpanel.add(resultC);
		resultpanel.add(resultF);
		resultpanel.add(resultK);

		resultButton = new ButtonGroup();
		resultButton.add(resultC);
		resultButton.add(resultF);
		resultButton.add(resultK);

		F = new JLabel("REAL");
		sourcetext.addActionListener(

				new ActionListener() // anonymous inner class
				{
					// perform conversions
					public void actionPerformed(ActionEvent event) {
						int convertTemp, temp;

						temp = Integer.parseInt(((JTextField) event.getSource()).getText());

						// Fahrenheit to Celsius
						if (sourceF.isSelected() && resultC.isSelected()) {
							convertTemp = (int) (5.0f / 9.0f * (temp - 32));
							resulttext.setText(String.valueOf(convertTemp));
						} 
							// Fahrenheit to Kelvin
						else if (sourceF.isSelected() && resultK.isSelected()) {
							convertTemp = (int) (5.0f / 9.0f * (temp - 32) + 273.15);
							resulttext.setText(String.valueOf(convertTemp));
							System.out.println(convertTemp);
						}
							// Celsius to Fahrenheit
						else if (sourceC.isSelected() && resultF.isSelected()) {
							convertTemp = (int) (9.0f / 5.0f * temp + 32);
							resulttext.setText(String.valueOf(convertTemp));
						}
						// Celsius to Kelvin
						else if (sourceC.isSelected() && resultK.isSelected()) {
							convertTemp = (int) (temp + 273.15);
							resulttext.setText(String.valueOf(convertTemp));
						}
						// Kelvin to Celsius
						else if (sourceK.isSelected() && resultC.isSelected()) {
							convertTemp = (int) (temp - 273.15);
							resulttext.setText(String.valueOf(convertTemp));
						} // end else if

						// Kelvin to Fahrenheit
						else if (sourceK.isSelected() && resultF.isSelected()) {
							convertTemp = (int) (9.0f / 5.0f * (temp - 273.15) + 32);
							resulttext.setText(String.valueOf(convertTemp));
						} // end else if
							// source and destination are the same; just copy
							// value
						else
							resulttext.setText(String.valueOf(temp));
					} // end method actionPerformed

				} // end anonymous inner class
		); // end call to addActionListener
		add(resulttext);

		add(resultpanel);
		setLayout(new GridLayout(8, 1));
		add(F);

	}

}
