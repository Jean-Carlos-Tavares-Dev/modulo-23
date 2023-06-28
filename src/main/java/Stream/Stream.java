package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
// não esquecer de adicionar filtro para não se importar se o caractere é maisculo ou minusculo. 

public class Stream {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Digite o Nome - Sexo(H ou M) separados por vírgula:");
			String input = scanner.nextLine();
			String[] nomes = input.split(",");
			ArrayList<String> listaNomes = new ArrayList<>(Arrays.asList(nomes));

			AgrupandoPorSexo.agruparPorSexo(listaNomes);
			
			Mulheres.imprimirMulheres(listaNomes);
		}
    }
}
