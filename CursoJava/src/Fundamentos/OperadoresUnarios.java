package Fundamentos;

public class OperadoresUnarios {
	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 2;

		// incremento e decremento
		n1++;
		System.out.println(n1);
		--n1;
		System.out.println(n1);
		System.out.println(++n1 == n2--);
		System.out.println(n1 == n2);
		
		//Complemento Binário
		System.out.println(Integer.toBinaryString(50));
		
		System.out.println(Integer.toBinaryString(~50));
		System.out.println(!true);
		
	}
}
