/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez.giuliano.tabuleiro;
/**
 *
 * @author gcres
 */
public class Jogador {
    
    String nome;
    String cor;
    char[] peca;
    
    public Jogador(String nome, String cor){
        
        this.nome = nome;
        this.cor = cor;
        
        //atribuindo a representação de cada peça para poder efetuar o controle
        //de cada peça do jogador já foi eliminada e qual a situação do seu rei
        peca[0] = 'p';
        peca[1] = 'p';
        peca[2] = 'p';
        peca[3] = 'p';
        peca[4] = 'p';
        peca[5] = 'p';
        peca[6] = 'p';
        peca[7] = 'p';
        peca[8] = 't';
        peca[9] = 't';
        peca[10] = 'c';
        peca[11] = 'c';
        peca[12] = 'b';
        peca[13] = 'b';
        peca[14] = 'q';
        peca[15] = 'k';
        
    }
    
    public String getNomeJogador(){
        return this.nome;
    }
    
    //verifica se o rei já foi eliminado durante o jogo
    public char verificaRei(){
        return peca[15];
    }
}
