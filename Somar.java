import java.util.*;

class Somar {
	public static Scanner sc = new Scanner(System.in);
	public static void main (String args[]) {
		int num1, num2, soma;
		System.out.println("digite um numero");
		num1 = sc.nextInt();
		System.out.println("digite outro numero");
		num2 = sc.nextInt();
		soma = num1 + num2;
		System.out.println("soma" + soma);
	}

}
