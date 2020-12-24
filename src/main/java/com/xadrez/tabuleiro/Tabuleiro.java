/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xadrez.tabuleiro;
import com.xadrez.tabuleiro.Posicao;
/**
 *
 * @author gcres
 */
public class Tabuleiro {
    
    Posicao tabuleiro[][];

    public Tabuleiro() {
        
        tabuleiro = new Posicao[8][8];
        
        for(int linha = 1; linha < 9; linha++){
            for(char coluna = 'a' ; coluna < 'i'; coluna++){
               
                tabuleiro[linha][coluna].setPosicao(linha, coluna);
                
                if(linha % 2 == 0 && coluna % 2 == 0){
                    tabuleiro[linha][coluna].setCor("preto");
                }
                else if(linha % 2 == 0 && coluna % 2 != 0){
                    tabuleiro[linha][coluna].setCor("branco");
                }
                else if(linha % 2 != 0 && coluna % 2 != 0){
                    tabuleiro[linha][coluna].setCor("preto");
                }
                else if(linha % 2 != 0 && coluna % 2 == 0){
                    tabuleiro[linha][coluna].setCor("branco");
                }
                
            }
        }
        
    }
    
    public void imprime(){
        for(char linha = 'a'; linha < 'h'; linha++){
            for(int coluna = 0 ; coluna < 8; coluna++){
                System.out.println(tabuleiro[linha][coluna].getCor());
                System.out.println("\n");
            }
        }
    }
    
    public boolean posicaoOcupada(int linha, char coluna){
        return tabuleiro[linha][coluna].posicaoOcupada(linha, coluna);
    }
    
}
