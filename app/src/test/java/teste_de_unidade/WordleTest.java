/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package teste_de_unidade;

import teste_de_unidade.Wordle;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordleTest {
    
    private Wordle wordle;
    
    public WordleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() throws IOException {
        wordle = new Wordle();

    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getWordle method, of class Wordle.
     */
    @Test
    public void testGetWordle() {
        ArrayList<String> temp = wordle.listaPalavras(3, 1);
        assertEquals(wordle.sorteiaPalavra(temp), wordle.getWordle());
       
    }

    /**
     * Test of palpiteValido method, of class Wordle.
     */
    @Test
    public void testPalpiteValido() {
        ArrayList<String> temp = wordle.listaPalavras(5, 1);
        //assertFalse(wordle.palpiteValido("aaaa", temp));
        //assertFalse(wordle.palpiteValido("arc0", temp));
        //assertTrue(wordle.palpiteValido("amor", temp));
        //assertTrue(wordle.palpiteValido("AMOR", temp));
        //assertTrue(wordle.palpiteValido("café", temp));
        //assertTrue(wordle.palpiteValido("cafe", temp));
        
        //CONFIGURAR COM TAMANHO 5:
        //assertFalse(wordle.palpiteValido("lobo", temp));
        //assertFalse(wordle.palpiteValido("avestruz", temp));
        assertTrue(wordle.palpiteValido("campo", temp));
        
       
    }

    /**
     * Test of palpiteWord method, of class Wordle.
     */
    @Test
    public void testPalpiteWord() {
        
    }

    /**
     * Test of repeat method, of class Wordle.
     */
    @Test
    public void testRepeat() {
        assertFalse(wordle.repeat(0));
        //assertFalse(wordle.repeat(-1));
        //assertTrue(wordle.repeat(1));
        //assertTrue(wordle.repeat(1000));

        
    }

    /**
     * Test of endGame method, of class Wordle.
     */
    @Test
    public void testEndGame() {
       
    }

    /**
     * Test of printTabela method, of class Wordle.
     */
    @Test
    public void testPrintTabela() {
       
    }

    /**
     * Test of printKeyboard method, of class Wordle.
     */
    @Test
    public void testPrintKeyboard() {
       
    }

    /**
     * Test of checkSize method, of class Wordle.
     */
    @Test
    public void testCheckSize() {
        assertFalse(wordle.checkSize(1));
        //assertFalse(wordle.checkSize(0));
        //assertFalse(wordle.checkSize(-1));
        //assertFalse(wordle.checkSize(24));
        //assertTrue(wordle.checkSize(2));       
    }

    /**
     * Test of listaPalavras method, of class Wordle.
     */
    @Test
    public void testListaPalavras() throws Exception {
        
    }

    /**
     * Test of sorteiaPalavra method, of class Wordle.
     */
    @Test
    public void testSorteiaPalavra() {
        ArrayList<String> temp = wordle.listaPalavras(6, 1);
        String palavraAnterior = wordle.sorteiaPalavra(temp);
        String palavraAtual;
        int cont=0;
        for (int i = 0; i <= 50; i++) {
            palavraAtual = wordle.sorteiaPalavra(temp);
            if (palavraAnterior.equals(palavraAtual)){
                cont++;                
            }
            else{
                cont--;
            }
        }
        System.out.println(cont);
        assertEquals(-51, cont);
        
    }

    private void IOException() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
