package Fundamentos;

public class Import {
	public static void main(String[] args) {
		boolean bo1 = false;
		boolean bo2 = true;
		System.out.printf(" %b %b ! \n", bo1, bo2);

		/*
		 * TIPO PRIMITIVO DE CARACTER
		 */

		char c1 = 'a';
		char c2 = '!';
		char asw = '\u0051';
		System.out.printf("%c, %c, %c\n", c1, c2, asw);

		/*
		 * TIPOS PRIMITIVOS INTEIROS
		 */

<<<<<<< HEAD
		byte b = 120;
=======
		byte b = 127;
>>>>>>> 97792613ae03b0a40c74cf0393b7c94a22627496
		short s = 32767;
		int i = 2_147_483_647;
		long l = 9_223_372_036_854_775_807L;
		System.out.printf("%d %d %d\n\n", b, s, i, l);
		System.out.printf("%d Convertido para bin é ",b );
		System.out.println(Integer.toBinaryString(b));
		System.out.printf("%d Convertido para bin é ",s );
		System.out.println(Integer.toBinaryString(s));
		System.out.printf("%d Convertido para bin é ",i );
		System.out.println(Integer.toBinaryString(i));
		System.out.printf("%d Convertido para bin é ",l );
		System.out.println(Long.toBinaryString(l));

	}
}
