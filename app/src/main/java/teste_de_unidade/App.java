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
        System.out.println("Adivinhe Se Puder!\n");//tive que alterar para println
        System.out.println("Digite o Tamanho da Palavra: ");//tive que alterar para println
        tamanhoPalavra = in.nextInt();
        /*
    Vou modularizar a verifica��o do tamanho da palavra
    fun��o checkSize(int size) na classe Wordle
         */
        while (true) {
            if (W.checkSize(tamanhoPalavra)) {
                break;
            } else {
                tamanhoPalavra = in.nextInt();
            }
        }

        /*
    C�DIGO ORIGINAL:   
    while (tamanhoPalavra < 2 || tamanhoPalavra > 23){
      System.out.print("Digite o Tamanho Entre 2 e 23 da Palavra: ");
      tamanhoPalavra = in.nextInt();
    }*/
        System.out.println("Digite a Quantidade de Tentativas: ");//tive que alterar para println
        tentativas = in.nextInt();

        //W = new Wordle(tamanhoPalavra,tentativas);CÓDIGO ORIGINAL: 
        listaPalavras = W.listaPalavras(tamanhoPalavra, tentativas);
        while (W.repeat(tentativas)) {
            System.out.println("Digite sua Palavra: ");//tive que alterar para println
            palpite = in.next();
            while (!W.palpiteValido(palpite, listaPalavras)) {
                System.out.println("N�o � uma palavra de " + tamanhoPalavra + 
                        " letras v�lida.\nDigite sua Palavra: ");
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
