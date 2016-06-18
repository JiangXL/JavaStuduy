package Ch17_fileStream;

import java.awt.BorderLayout;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class fileChooser extends JFrame {
	private JTextArea outputArea;
	private JScrollPane ScrollPane;
	
	public fileChooser(){
		
		super("TEST FILECHOOSER");
		setLocationRelativeTo(null);
		outputArea =new JTextArea();
		ScrollPane=new JScrollPane(outputArea);
		add(ScrollPane,BorderLayout.CENTER);
		
		JFileChooser fileChoolser =new JFileChooser();
		fileChoolser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		int result=fileChoolser.showOpenDialog(this);
		int test=fileChoolser.showSaveDialog(this);
		System.out.println(result);
		System.out.println(test);
		
	}
	
	public static  void  main(String []args){
		fileChooser app=new fileChooser();
		app.setSize(400,330);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
			
}
