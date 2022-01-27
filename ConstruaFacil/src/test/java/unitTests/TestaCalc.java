package unitTests;

import devcalc.Calc;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class TestaCalc {
    @Test

    public static void testarSomarDoisNumeros() {

        // 1 - Prepara - Configurar - Given
        // Testar dois valores de entrada e um valor para saida
        int num1 =5;
        int num2 =7;
        int resultadoEsperado = 12;

        // 2 - Executar - When
        int resultadoAtual = Calc.somarDoisNumeros(num1, num2);

        // 3 - Validar - Then
        System.out.println("O resultado esperado é " + resultadoEsperado + "\n O resultado atual foi " + resultadoAtual);

        assertEquals(resultadoEsperado,resultadoAtual);
    }
    @Test


}


