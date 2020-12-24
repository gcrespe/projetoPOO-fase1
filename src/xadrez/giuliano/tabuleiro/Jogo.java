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
public class Jogo {
    
    public Tabuleiro tabuleiro;
    public Jogador jogador1;
    public Jogador jogador2;
    public boolean vez = false;
    
    // construtor inicializando um tabuleiro para o jogo
    public Jogo(){
        this.tabuleiro = new Tabuleiro();
    }
    
    //repassando os parametros recebidos para a classe tabuleiro, que irá redirecionar
    //para cada peça em si
    public boolean testePecas(int linhaOrigem, String colunaOrigem, int linhaDestino, String colunaDestino, String cor, String peca){
        return this.tabuleiro.Checar(linhaOrigem, linhaDestino, colunaDestino, colunaOrigem, cor, peca);
    }
    
}
