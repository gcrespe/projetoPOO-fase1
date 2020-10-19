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
public class Torre {
    
    public int posicao;
    public boolean capturado = false;
    public boolean cor;
    
    Torre(int posicao, boolean cor){
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
        if(this.posicao + 8 == posicao 
           || this.posicao + 16 == posicao
           || this.posicao + 24 == posicao
           || this.posicao + 32 == posicao
           || this.posicao + 40 == posicao 
           || this.posicao + 48 == posicao
           || this.posicao + 56 == posicao
           || this.posicao + 64 == posicao
           || this.posicao - 8 == posicao 
           || this.posicao - 16 == posicao
           || this.posicao - 24 == posicao
           || this.posicao - 32 == posicao
           || this.posicao - 40 == posicao 
           || this.posicao - 48 == posicao
           || this.posicao - 56 == posicao
           || this.posicao - 64 == posicao
           || this.posicao + 1 == posicao 
           || this.posicao + 2 == posicao
           || this.posicao + 3 == posicao
           || this.posicao + 4 == posicao
           || this.posicao + 5 == posicao 
           || this.posicao + 6 == posicao
           || this.posicao + 7 == posicao
           || this.posicao + 8 == posicao
           || this.posicao - 1 == posicao 
           || this.posicao - 2 == posicao
           || this.posicao - 3 == posicao
           || this.posicao - 4 == posicao
           || this.posicao - 5 == posicao 
           || this.posicao - 6 == posicao
           || this.posicao - 7 == posicao
           || this.posicao - 8 == posicao){
            return true;
        }
        else return false;
    }
    
}
