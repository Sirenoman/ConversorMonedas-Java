package conversorMonedas.utils;

import javax.swing.JOptionPane;

import conversorMonedas.modelos.ConverMoney;
import conversorMonedas.modelos.ConverMoneyTo;

public class FunctionMoney {
	ConverMoney moneys = new ConverMoney();
	ConverMoneyTo moneysReturn = new ConverMoneyTo();
	
	public void convertMoney(double Minput) {
		String[] opciones = {"De Dolar a pesos Mx","De dolar a euros","De dolar a libras","De dolar a Yen",
					"De dolar a Won Coreano","De peso Mx a dolar","De euro a dolar","De libra a dolar",
					"De Yen a dolar","De Won Coreano a Dolar"};
		String option = JOptionPane.showInputDialog(null, "Elija la moneda a la que deseas convertir tu dinero",
					"Monedas", JOptionPane.PLAIN_MESSAGE, null, opciones, "Seleccion").toString();
		switch(option) {
		case "De Dolar a pesos Mx":
			moneys.convertDollarToMx(Minput);
			break;
		case "De dolar a euros":
			moneys.convertDollarToEur(Minput);
			break;
		case "De dolar a libras":
			moneys.convertDollarToLib(Minput);
			break;
		case "De dolar a Yen":
			moneys.convertDollarToYen(Minput);
			break;
		case "De dolar a Won Coreano":
			moneys.convertDollarToWon(Minput);
			break;
		case "De peso Mx a dolar":
			moneysReturn.convertMxToDollar(Minput);
			break;
		case "De euro a dolar":
			moneysReturn.convertEuroToDollar(Minput);
			break;
		case "De libra a dolar":
			moneysReturn.convertLibToDollar(Minput);
			break;
		case "De Yen a dolar":
			moneysReturn.convertYenToDollar(Minput);
			break;
		case "De Won Coreano a Dolar":
			moneysReturn.convertWonToDollar(Minput);
			break;
		}
	}
	

}
