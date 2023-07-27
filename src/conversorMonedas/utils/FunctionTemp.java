package conversorMonedas.utils;

import javax.swing.JOptionPane;

import conversorMonedas.modelos.ConvertTemp;

public class FunctionTemp {
	ConvertTemp temp = new ConvertTemp();
	
	/**
	 * 
	 * @param Tinput
	 */
	public void convertTempeture(double Tinput) {
		String[] opciones = { "De Celcius a Fahrenheit", "De Celcius a Kelvin", "De Fahrenheit a Celcius", 
				"De Fahrenheit a Kelvin", "De Kelvin a Celcius", "De Kelvin a Fahrenheit" };
		String option = JOptionPane.showInputDialog(null, "Elija la temperatura a la que deseas convertir",
				"Monedas", JOptionPane.PLAIN_MESSAGE, null, opciones, "Seleccion").toString();
		switch (option) {
		case "De Celcius a Fahrenheit":
			temp.convertCelToFahr(Tinput);
			break;
		case "De Celcius a Kelvin":
			temp.convertCelToKel(Tinput);
			break;
		case "De Fahrenheit a Celcius":
			temp.convertFahrToCel(Tinput);
			break;
		case "De Fahrenheit a Kelvin":
			temp.convertFahrToKel(Tinput);
			break;
		case "De Kelvin a Celcius":
			temp.convertKelToCel(Tinput);
			break;
		case "De Kelvin a Fahrenheit":
			temp.convertKelToFahr(Tinput);
			break;
		}
	}

}
