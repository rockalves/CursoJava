package Fundamentos;

public class ConversaoNumerica {
	public static void main(String[] args) {
		// Exemplo 1 - Conversão Explícita
		float f = (float) 0.1;

		// Exemplo 2 - Conversão explícita 2
		int i1 = (int) 7.9;
		System.out.println(i1);
		
		//Exemplo 3 COnverão Implícita
		int i2 = 'a';
		System.out.println(i2);
		
		double d = 1001;
		System.out.println(d);
	}
}
