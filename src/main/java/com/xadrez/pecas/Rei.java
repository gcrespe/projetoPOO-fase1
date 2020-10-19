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
public class Rei {
    
    public int posicao;
    public boolean capturado = false;
    public boolean cor;
    
    Rei(int posicao, boolean cor){
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
        if(this.posicao + 1 == posicao 
           || this.posicao + 7 == posicao
           || this.posicao + 8 == posicao
           || this.posicao + 9 == posicao
           || this.posicao - 1 == posicao 
           || this.posicao - 7 == posicao
           || this.posicao - 8 == posicao
           || this.posicao - 9 == posicao){
            return true;
        }
        else return false;
    }
    
}
