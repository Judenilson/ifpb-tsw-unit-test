/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste_de_unidade;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class App {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String palpite;
        int tamanhoPalavra;
        int tentativas;
        ArrayList<String> listaPalavras;

        Wordle W = new Wordle();//novo construtor
        System.out.println("Davi Juv�ncio\n");
        System.out.println("Projeto:\n");
        System.out.println("Adivinhe Se Puder!\n");//EQUIPE DE TESTE: alterado para println
        System.out.println("Digite o Tamanho da Palavra: ");//EQUIPE DE TESTE: alterado para println
        tamanhoPalavra = in.nextInt();
        
        //EQUIPE DE TESTE: C�DIGO ORIGINAL LEVADO PARA A CLASSE Wordle.java
         
        while (true) {
            if (W.checkSize(tamanhoPalavra)) {
                break;
            } else {
                tamanhoPalavra = in.nextInt();
            }
        }

        /*
    //EQUIPE DE TESTE: C�DIGO ORIGINAL LEVADO PARA A CLASSE Wordle.java   
    while (tamanhoPalavra < 2 || tamanhoPalavra > 23){
      System.out.print("Digite o Tamanho Entre 2 e 23 da Palavra: ");
      tamanhoPalavra = in.nextInt();
    }*/

        System.out.println("Digite a Quantidade de Tentativas: ");//EQUIPE DE TESTE: alterado para println
        tentativas = in.nextInt();

        //W = new Wordle(tamanhoPalavra,tentativas); C�DIGO ORIGINAL: 
        listaPalavras = W.listaPalavras(tamanhoPalavra, tentativas);
        while (W.repeat(tentativas)) {
            System.out.println("Digite sua Palavra: ");//EQUIPE DE TESTE: alterado para println
            palpite = in.next();
            while (!W.palpiteValido(palpite, listaPalavras)) {
                System.out.println("N�o � uma palavra de " + tamanhoPalavra + 
                        " letras v�lida.\nDigite sua Palavra: "); //EQUIPE DE TESTE: alterado para println
                palpite = in.next();
            }
            W.palpiteWord(palpite);
            W.printTabela(tentativas);
            W.printKeyboard();
            W.printTabela(tentativas);
        }
        W.endGame();
    }
}
