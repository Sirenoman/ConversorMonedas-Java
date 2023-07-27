package conversorMonedas.modelos;

import javax.swing.JOptionPane;

public class ConverMoney {
	
	public void convertDollarToMx(double value) {
		double money = value * 16.8386;
		money = (double) Math.round(money*100d)/100d;
		JOptionPane.showMessageDialog(null, "Tienes $" + money + " pesos Mx");
	}
	
	public void convertDollarToEur(double value) {
		double money = value * 0.9011;
		money = (double) Math.round(money*100d)/100d;
		JOptionPane.showMessageDialog(null, "Tienes $" + money + " euros");
	}
	
	public void convertDollarToLib(double value) {
		double money = value * 0.77;
		money = (double) Math.round(money*100d)/100d;
		JOptionPane.showMessageDialog(null, "Tienes $" + money + " Libras");
	}
	
	public void convertDollarToYen(double value) {
		double money = value * 139.94;
		money = (double) Math.round(money*100d)/100d;
		JOptionPane.showMessageDialog(null, "Tienes $" + money + " Yenes");
	}
	
	public void convertDollarToWon(double value) {
		double money = value * 1274.35;
		money = (double) Math.round(money*100d)/100d;
		JOptionPane.showMessageDialog(null, "Tienes $" + money + " Wones");
	}

}
