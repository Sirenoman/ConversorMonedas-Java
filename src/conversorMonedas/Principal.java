package conversorMonedas;


import javax.swing.JOptionPane;

import conversorMonedas.utils.FunctionMoney;
import conversorMonedas.utils.FunctionTemp;

public class Principal {
	
	public static void main(String[] args) {
		
		FunctionMoney money = new FunctionMoney();
		FunctionTemp temp = new FunctionTemp();
		
		String[] possibleValues = { "Conversor de monedas", "Conversor de Temperatura" };
		boolean flag = true;

		while (flag) {

			Object selectedValue = JOptionPane.showInputDialog(null, "Selecciona una opcion de conversion", "Menu",
					JOptionPane.QUESTION_MESSAGE, null, possibleValues, "Seleccion");
			if(selectedValue == null) {
				JOptionPane.showMessageDialog(null, "Programa terminado");
				flag = false;
			}

			//System.out.println(selectedValue);
			switch (selectedValue.toString()) {
			case "Conversor de monedas":
				String input = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir: ");
				System.out.println(input);
				if (validNum(input)) {
					double Minput = Double.parseDouble(input);
					money.convertMoney(Minput);
					
					int answer = JOptionPane.showConfirmDialog(null, "Deseas realizar otra conversion?");
					if(JOptionPane.OK_OPTION != answer) {
						JOptionPane.showMessageDialog(null, "Programa terminado");
						flag = false;
					}

				} else {
					JOptionPane.showMessageDialog(null, "valor no valido", "Mensaje", JOptionPane.ERROR_MESSAGE);
				}
				break;
			case "Conversor de Temperatura":
				input = JOptionPane.showInputDialog("Ingrese el grado de temperatura que desea convertir: ");
				System.out.println(input);
				if (validNum(input)) {
					double Tinput = Double.parseDouble(input);
					temp.convertTempeture(Tinput);
					
					int answer = JOptionPane.showConfirmDialog(null, "Deseas realizar otra conversion?");
					if(JOptionPane.OK_OPTION != answer) {
						JOptionPane.showMessageDialog(null, "Programa terminado");
						flag = false;
					}
					
				} else {
					JOptionPane.showMessageDialog(null, "valor no valido", "Mensaje", JOptionPane.ERROR_MESSAGE);
				}
				break;

			}
		}

	}
	
	/**
	 * 
	 * @param num
	 * @return boolean
	 */
	public static boolean validNum(String num) {

		if (!num.isEmpty()) {
			try {
				double x = Double.parseDouble(num);
				if (x >= 0 || x < 0);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}else {
			return false;
		}
	}

}
