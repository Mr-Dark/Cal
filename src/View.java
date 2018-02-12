import java.awt.*;
import java.util.Enumeration;

import javax.naming.ldap.ManageReferralControl;
import javax.swing.*;

import org.apache.commons.lang3.StringUtils;


public class View extends JFrame {
	private TextField txt1,txt2;
	private JRadioButton addRB,subRB,mulRB,divRB,modRB,sqrRB;
	private ButtonGroup rbGroup;
	private JButton Calculate;
	Controller controller;
	private JFrame frame;
	private JLabel result;
	//construtor
	public View() {
		initialzeObjects();
		groupRadioButtons();
		addItemstoFrame();
		
		frame.setTitle("Calcualtor");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(350, 150);
		frame.setResizable(false);
		frame.setLayout(new FlowLayout());
		addRB.setSelected(true);

	}
	
	public void registerEvents() {
		Calculate.addActionListener(controller);
		
	}

	public void groupRadioButtons() {
		rbGroup.add(addRB);
		rbGroup.add(subRB);
		rbGroup.add(mulRB);
		rbGroup.add(divRB);
		rbGroup.add(modRB);
		rbGroup.add(sqrRB);
	}
	
	public void addItemstoFrame() {
		frame.add(txt1);
		frame.add(txt2);
		frame.add(addRB);
		frame.add(subRB);
		frame.add(mulRB);
		frame.add(divRB);
		frame.add(modRB);
		frame.add(sqrRB);
		frame.add(Calculate);
		frame.add(result);
	}
	
	public void initialzeObjects() {
	    frame =new JFrame();
		txt1=new TextField(20);
		txt2=new TextField(20);
		addRB=new JRadioButton("+");
		subRB=new JRadioButton("-");
		mulRB=new JRadioButton("*");
		modRB=new JRadioButton("%");
		divRB=new JRadioButton("/");
		result=new JLabel("Result");
		sqrRB=new JRadioButton("sqr");
		rbGroup=new ButtonGroup();
		Calculate=new JButton("Calculate");
	}

	public void addController(Controller controller) {
		this.controller=controller;
	}
	
	public String getSelectedName() {
		for (Enumeration<AbstractButton> buttons = rbGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }
	return null;
	}
	
	public double getNumber1() {
		if(!StringUtils.isNumeric(txt1.getText())) {
			return 0;
		}
		return Double.parseDouble(txt1.getText());
	}
	
	public double getNumber2() {
		if(!StringUtils.isNumeric(txt2.getText())) {
			return 0;
		}
		return Double.parseDouble(txt2.getText());
	}
	
	public void setResult(double result) {
		this.result.setText(result+"");
	}
}
