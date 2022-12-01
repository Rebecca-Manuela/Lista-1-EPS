import java.util.Scanner;
public class AreaCircunferencia {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		double area, raio;
		System.out.println("Digite o tamanho do raio: ");
		raio = in.nextDouble();
		area = 3.14*raio*raio;
		System.out.println("A circunferência da área é: "+area);		
		in.close();
	}
}
