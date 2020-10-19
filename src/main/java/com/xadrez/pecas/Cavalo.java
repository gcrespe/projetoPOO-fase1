/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xadrez.pecas;

/**
 *
 * @author gcres
 */
public class Cavalo {
    
    public int posicao;
    public boolean capturado = false;
    public boolean cor;
    
    Cavalo(int posicao, boolean cor){
        setPosicao(posicao);
        setCor(cor);
    }
    
    void setPosicao(int posicao){
        this.posicao = posicao;
    }
    
    void setCor(boolean cor){
        this.cor = cor;
    }
    
    boolean movimentar(int posicao){
        if(this.posicao + 6 == posicao 
           || this.posicao + 10 == posicao
           || this.posicao + 15 == posicao
           || this.posicao + 17 == posicao
           || this.posicao - 17 == posicao
           || this.posicao - 15 == posicao
           || this.posicao - 10 == posicao
           || this.posicao - 6 == posicao){
            return true;
        }
        else return false;
    }
    
}
