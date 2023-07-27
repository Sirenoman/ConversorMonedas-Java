package conversorMonedas.modelos;

import javax.swing.JOptionPane;

public class ConverMoneyTo {
	
	/**
	 * Metodos generados para la conversion de cada moneda
	 * Estos metodos aplicaran una misma funcion de convertir de un valor en double
	 * siendo estos redondeados a minimo 2 decimales para su presentacion como mensaje emergente
	 * con la clase JOptionPane
	 * 
	 * @param value
	 * @author jonat
	 */
	public void convertMxToDollar(double value) {
		double money = value / 16.82;
		money = (double) Math.round(money*100d)/100d;
		JOptionPane.showMessageDialog(null, "Tienes $" + money + " dolares");
	}
	
	public void convertEuroToDollar(double value) {
		double money = value / 0.90;
		money = (double) Math.round(money*100d)/100d;
		JOptionPane.showMessageDialog(null, "Tienes $" + money + " dolares");
	}
	
	public void convertLibToDollar(double value) {
		double money = value / 0.77;
		money = (double) Math.round(money*100d)/100d;
		JOptionPane.showMessageDialog(null, "Tienes $" + money + " dolares");
	}
	
	public void convertYenToDollar(double value) {
		double money = value / 139.94;
		money = (double) Math.round(money*100d)/100d;
		JOptionPane.showMessageDialog(null, "Tienes $" + money + " dolares");
	}
	
	public void convertWonToDollar(double value) {
		double money = value / 1273.26;
		money = (double) Math.round(money*100d)/100d;
		JOptionPane.showMessageDialog(null, "Tienes $" + money + " dolares");
	}
}
