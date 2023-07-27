package conversorMonedas.modelos;

import javax.swing.JOptionPane;

public class ConvertTemp {
	
	public void convertCelToFahr(double value) {
		double grade = (value*9/5) + 32;
		grade = (double) Math.round(grade*100d)/100d;
		JOptionPane.showMessageDialog(null, "Son " + grade + "° grados Fahrenheit");
	}
	
	public void convertCelToKel(double value) {
		double grade = value + 273.15;
		grade = (double) Math.round(grade*100d)/100d;
		JOptionPane.showMessageDialog(null, "Son " + grade + "° grados Kelvin");
	}
	
	public void convertFahrToCel(double value) {
		double grade = (value-32)/1.8;
		grade = (double) Math.round(grade*100d)/100d;
		JOptionPane.showMessageDialog(null, "Son " + grade + "° grados Celcius");
	}
	
	public void convertFahrToKel(double value) {
		double grade = (value+459.67)*5/9;
		grade = (double) Math.round(grade*100d)/100d;
		JOptionPane.showMessageDialog(null, "Son " + grade + "° grados Kelvin");
	}
	
	public void convertKelToCel(double value) {
		double grade = value - 273.15;
		grade = (double) Math.round(grade*100d)/100d;
		JOptionPane.showMessageDialog(null, "Son " + grade + "° grados Celcius");
	}
	
	public void convertKelToFahr(double value) {
		double grade = 1.8*(value - 273) + 32;
		grade = (double) Math.round(grade*100d)/100d;
		JOptionPane.showMessageDialog(null, "Son " + grade + "° grados Fahrenheit");
	}

}
