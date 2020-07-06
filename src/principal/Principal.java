package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Produto;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Produto> list = new ArrayList<>();
		
		int n = 1;
		char continuar = 0;
		
		System.out.print("Percentual do imposto: ");
		double ipi = sc.nextDouble();
		
		do {
			System.out.println();
			System.out.println("Produto #" + n++ + ":");
			System.out.print("Código: ");
			int codigo = sc.nextInt();
			while (hasId(list, codigo)) {
				System.out.print("Código em uso, tente outro: ");
				codigo = sc.nextInt();
			}
			System.out.print("Valor unitário: ");
			double valorUnit = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			list.add(new Produto(codigo, valorUnit, quantidade, ipi));
			
			System.out.print("Incluir mais produtos (s/n)? ");
			continuar = sc.next().charAt(0);
		} while(continuar == 's' || continuar == 'S');
		
		System.out.println();
		System.out.println("Dados atualizados:");
		for(entidades.Produto prod : list) {
			System.out.println(prod);
		}
			
		
		sc.close();

	}

	private static boolean hasId(List<Produto> list, int codigo) {
		Produto produto = list.stream().filter(x -> x.getCodigo() == codigo).findFirst().orElse(null);
		return produto != null;
	}

}
