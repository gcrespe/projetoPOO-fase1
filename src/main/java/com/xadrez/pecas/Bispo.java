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
public class Bispo {
    
    public int posicao;
    public boolean capturado = false;
    public boolean cor;
    
    Bispo(int posicao, boolean cor){
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
        if(posicao % 7 == 0 || posicao % 9 == 0){
            return true;
        }
        else return false;
    }
    
}
