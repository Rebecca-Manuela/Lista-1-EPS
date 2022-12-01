import java.util.Scanner;
public class DobroETriplo {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		double valor, dobro, triplo;
		System.out.println(" Digite o valor: ");
		valor = in.nextDouble();
		dobro = valor*2;
		triplo = valor*3;
		System.out.println(" O dobro do valor é "+dobro+" e o triplo é "+triplo);
		in.close();
	}

}
