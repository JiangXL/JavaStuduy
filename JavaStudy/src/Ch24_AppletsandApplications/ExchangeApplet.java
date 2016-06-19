package Ch24_AppletsandApplications;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ExchangeApplet extends JApplet {
	
	private JLabel jl;
	private JPanel jp;
	private JTextField RMB;
	private JTextField Dollar;
	private JLabel RMBLabel;
	private JLabel DollarLabel;
	
	private double rate = 6.5;

	public void init() {
		jl = new JLabel("在线汇率计算器");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		add(jl, BorderLayout.NORTH);
		
		jp = new JPanel();

		jp.setLayout(new GridLayout(2,2));
		
		RMB = new JTextField();
		Dollar = new JTextField();
		RMBLabel = new JLabel("人民币");
		DollarLabel = new JLabel("美元");

		RMBLabel.setHorizontalAlignment(SwingConstants.CENTER);
		DollarLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		RMB.addActionListener(new Listener());
		Dollar.addActionListener(new Listener());
		
		jp.add(RMBLabel);
		jp.add(RMB);

		jp.add(DollarLabel);
		jp.add(Dollar);
		
		add(jp, BorderLayout.CENTER);

		RMB.addActionListener(new Listener());
		Dollar.addActionListener(new Listener());
		
	} 

	public void destory(){
		remove(jl);
		remove(jp);
	}
	
	class Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == RMB){
	              double temp = Double.parseDouble( ( ( JTextField ) e.getSource() ).getText() );
	              double result = temp / 6.5;
	              Dollar.setText(String.valueOf( result ) );
			}else if(e.getSource() == Dollar){
	              double temp = Double.parseDouble( ( ( JTextField ) e.getSource() ).getText() );
	              double result = temp * 6.5;
	              RMB.setText(String.valueOf( result ) );				
			}
		}
	}

}
