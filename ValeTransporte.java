import java.util.Scanner;
public class ValeTransporte {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		double salarioBruto, descontoVT;
		System.out.println("Qual o salário bruto?");
		salarioBruto = in.nextDouble();
		descontoVT = salarioBruto*6/100;
		System.out.println("o desconto do Vale Transporte é: "+descontoVT);
		in.close();
	}
}
