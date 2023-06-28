package Stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AgrupandoPorSexo {
    public static void agruparPorSexo(ArrayList<String> nomes) {
        Map<String, ArrayList<String>> sexoNomesMap = new HashMap<>();

        for (String nome : nomes) {
            String[] partes = nome.split("-");
            String nomePessoa = partes[0].trim();
            String sexo = partes[1].trim();

            if (sexoNomesMap.containsKey(sexo)) {
                sexoNomesMap.get(sexo).add(nomePessoa);
            } else {
                ArrayList<String> listaNomesPorSexo = new ArrayList<>();
                listaNomesPorSexo.add(nomePessoa);
                sexoNomesMap.put(sexo, listaNomesPorSexo);
            }
        }

        for (Map.Entry<String, ArrayList<String>> entry : sexoNomesMap.entrySet()) {
            String sexo = entry.getKey();
            ArrayList<String> nomesPorSexo = entry.getValue();

            System.out.println("Sexo: " + sexo);
            System.out.println("Nomes: " + nomesPorSexo);
            System.out.println();
        }
    }
}
