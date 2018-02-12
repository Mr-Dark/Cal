import java.lang.Math;

import javax.swing.JOptionPane;
public class Modle {
	
public double add(double x,double y) {
	return x+y;
}
public double sub(double x,double y) {
	
	return x-y;
}
public double mul(double x,double y) {
	
	return x*y;
}
public double div(double x,double y) {
	if(y==0)
	{
		return 0;
	}
	return x/y;
}
public double mod(double x,double y) {
	
	return x%y;
}
public double sq(double x) {
	if(x<0) {
	 x=x*-1;
	}
		
	return Math.sqrt(x);
}

}
