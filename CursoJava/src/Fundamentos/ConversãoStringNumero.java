package Fundamentos;

import javax.swing.JOptionPane;

public class ConversãoStringNumero {
	public static void main(String[] args) {
		String resposta1 = JOptionPane.showInputDialog("Qual é a nota 1?");
		String resposta2 = JOptionPane.showInputDialog("Qual é a nota 2?");
		System.out.println(resposta1 + resposta2);

		// Converter de String para double
		double nota1 = Double.parseDouble(resposta1);
		double nota2 = Double.parseDouble(resposta2);
		double total = nota1 + nota2;
		JOptionPane.showInputDialog("O total é=", total);
		JOptionPane.showInputDialog("A média é=", total/2);
<<<<<<< HEAD
	
=======
		
>>>>>>> 97792613ae03b0a40c74cf0393b7c94a22627496
	//	System.out.println("Total é: " + total / 2);
	}
}
