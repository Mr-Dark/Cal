import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
	View v;
	Modle m;
	public static void main (String argsp[])
	{
		Controller c=new Controller();
	}

	public Controller() {
		 v=new View();
		v.addController(this);
		v.registerEvents();
		 m=new Modle();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double number1,number2;
		number1=v.getNumber1();
		number2=v.getNumber2();
		///System.out.println(number1+"..."+number2);
		double result = 0;
		String selected=v.getSelectedName();
		if(selected.compareTo("+")==0)
			result=m.add(number1, number2);
		if(selected.compareTo("-")==0)
			result=m.sub(number1, number2);
		if(selected.compareTo("*")==0)
			result=m.mul(number1, number2);
		if(selected.compareTo("/")==0)
			result=m.div(number1, number2);
		if(selected.compareTo("%")==0)
			result=m.mod(number1, number2);
		if(selected.compareTo("sqr")==0)
			result=m.sq(number1);
		
		v.setResult(result);
	}

}
