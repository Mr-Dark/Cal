import java.awt.*;

import javax.naming.ldap.ManageReferralControl;
import javax.swing.*;


public class View extends JFrame {
	private TextField txt1,txt2;
	private JRadioButton addRB,subRB,mulRB,divRB,modRB,sqrRB;
	private ButtonGroup rbGroup;
	private JButton Calculate;
	
	//construtor
	public View() {
		JFrame frame =new JFrame();
		frame.setTitle("Calcualtor");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(380, 150);
		frame.setResizable(false);
		txt1=new TextField(20);
		txt2=new TextField(20);
		addRB=new JRadioButton("+");
		subRB=new JRadioButton("-");
		mulRB=new JRadioButton("*");
		modRB=new JRadioButton("%");
		divRB=new JRadioButton("/");
		sqrRB=new JRadioButton("sqr");
		rbGroup=new ButtonGroup();
		Calculate=new JButton("Calculate");
		rbGroup.add(addRB);
		rbGroup.add(subRB);
		rbGroup.add(mulRB);
		rbGroup.add(divRB);
		rbGroup.add(modRB);
		rbGroup.add(sqrRB);
		addRB.setSelected(true);
		frame.setLayout(new FlowLayout());
		frame.add(txt1);
		frame.add(txt2);
		frame.add(addRB);
		frame.add(subRB);
		frame.add(mulRB);
		frame.add(divRB);
		frame.add(modRB);
		frame.add(sqrRB);
		frame.add(Calculate);
		
		
	}
	

}
