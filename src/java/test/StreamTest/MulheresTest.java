package StreamTest;

import org.junit.Assert;
import org.junit.Test;

import Stream.Mulheres;

public class MulheresTest {
	@Test
	public void mulherTest() {
        Mulheres mulherT = new Mulheres();
        String[] nomes = {"Maria-F", "João-M", "Ana-F", "Pedro-M"};
        
        boolean todasMulheres = Mulheres.verificarApenasMulheres(nomes);
        
        Assert.assertTrue("Esperado que apenas existam mulheres", todasMulheres);
    }
}
