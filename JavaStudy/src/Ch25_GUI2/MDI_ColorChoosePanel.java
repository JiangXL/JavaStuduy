package Ch25_GUI2;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JColorChooser;
public class MDI_ColorChoosePanel extends JPanel  {

	private JButton changecolorButton;
	private Color color = Color.BLUE;
	private JPanel colorpanel;

	public MDI_ColorChoosePanel(){

		colorpanel = new JPanel();
		colorpanel.setBackground(color);

		changecolorButton = new JButton("Change panel'scolor");
		changecolorButton.addActionListener(

				new ActionListener()

				{
					public void actionPerformed(ActionEvent event) {
						color = JColorChooser.showDialog(colorpanel, "Choose a color", color);
						//color2=JColorChooser.showDialog(, "Choose a color", color)

						if (color == null) {
							color = Color.LIGHT_GRAY;
						}

						colorpanel.setBackground(color);

					}
				});

	}

}


