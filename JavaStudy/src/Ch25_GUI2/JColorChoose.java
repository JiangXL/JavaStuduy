package Ch25_GUI2;
import java.awt.BorderLayout;
import java.awt.event.*;// java.awt.*ÖÐ²»°üÀ¨java.awt.event.*
import java.awt.*;
import javax.swing.*;
public class JColorChoose extends JFrame{
	private JButton changecolorButton;
	private Color color=Color.LIGHT_GRAY;
	private JPanel colorpanel;
	
	public JColorChoose(){
		super("Color Pad");
		setLocationRelativeTo(null);
		colorpanel =new JPanel();
		colorpanel.setBackground(color);
		
		changecolorButton=new JButton("Change panel'scolor");
		changecolorButton.addActionListener(
				
				new ActionListener()
				
				{
					public void actionPerformed(ActionEvent event){
						color =JColorChooser.showDialog(
								JColorChoose.this,"Choose a color",color);
						//JColorChoose.this -->colorpanel :work
						
						if(color==null){
							color=Color.LIGHT_GRAY;
						}
						
						colorpanel.setBackground(color);
						
					}
				}
				);
	
		add(colorpanel,BorderLayout.CENTER);
		add(changecolorButton,BorderLayout.SOUTH);
		setSize(400,230);
		setVisible(true);
		
	}
	public static void main(String args[]){
		JColorChoose appJfram =new JColorChoose();
		
	}
	

}
