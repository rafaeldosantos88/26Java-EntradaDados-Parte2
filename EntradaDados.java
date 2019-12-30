package EntradaDados;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {

		Scanner rafa = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		x = rafa.nextInt();
		rafa.nextLine();  //Para conserva a quebra de linha do x que vai dar erro ou pular execução
		s1 = rafa.nextLine(); // Se colocar apenas o next vai ler somente a primeira palavra da linha
		s2 = rafa.nextLine();
		s3 = rafa.nextLine();

		System.out.println("Dados Digitados:");

		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		rafa.close(); // Encerra programa

	}

}
