package Stream;
import java.util.ArrayList;

public class Mulheres {
	public static void imprimirMulheres(ArrayList<String> nomes) {
        ArrayList<String> mulheres = new ArrayList<>(nomes.stream()
                .filter(nome -> nome.split("-")[1].trim().equalsIgnoreCase("m"))
                .map(nome -> nome.split("-")[0].trim())
                .toList());

        System.out.println("Mulheres cadastradas: " + mulheres);
    }

	public static boolean verificarApenasMulheres(String[] nomes) {
		// TODO Auto-generated method stub
		return false;
	}
}

