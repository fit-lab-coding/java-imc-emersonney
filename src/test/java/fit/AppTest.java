package fit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Testes unitários para projeto IMC, considerando as seguintes regras:
 * Magreza, quando o resultado é menor que 18,5 kg/m2;
 * Normal, quando o resultado está entre 18,5 e 24,9 kg/m2;
 * Sobrepeso, quando o resultado está entre 24,9 e 30 kg/m2;
 * Obesidade, quando o resultado é maior que 30 kg/m2;
 */
public class AppTest 
{
    /**
     * Based on input, this calculation must return Magreza
     */
    @Test
    public void shouldCalculateMagreza()
    {
        // arrange
        double altura = 1.77;
        double peso = 50;

        // act
        String indice = CalculadoraImc.obterIndice(altura, peso);

        // assert
        assertEquals("Magreza", indice);
    }

    /**
     * Based on input, this calculation must return Magreza
     */
    @Test
    public void shouldCalculateNormal()
    {
        // arrange
        double altura = 1.77;
        double peso = 70;

        // act
        String indice = CalculadoraImc.obterIndice(altura, peso);

        // assert
        assertEquals("Normal", indice);
    }

    /**
     * Based on input, this calculation must return Sobrepeso
     */
    @Test
    public void shouldCalculateSobrepeso()
    {
        // arrange
        double altura = 1.77;
        double peso = 83;

        // act
        String indice = CalculadoraImc.obterIndice(altura, peso);

        // assert
        assertEquals("Sobrepeso", indice);
    }

    /**
     * Based on input, this calculation must return Obesidade
     */
    @Test
    public void shouldCalculateObesidade()
    {
        // arrange
        double altura = 1.77;
        double peso = 100;

        // act
        String indice = CalculadoraImc.obterIndice(altura, peso);

        // assert
        assertEquals("Obesidade", indice);
    }
}
