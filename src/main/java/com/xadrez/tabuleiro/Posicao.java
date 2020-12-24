/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xadrez.tabuleiro;

/**
 *
 * @author gcres 
 */
public class Posicao {
    
    private int linha;
    private char coluna;
    private String cor;
    private boolean ocupada;
    
    public Posicao(){
        this.coluna = ' ';
        this.linha = -1;
    }
    
    public void setPosicao(int linha, char coluna){
        this.coluna = coluna;
        this.linha = linha;
        if(linha == 1 || linha == 2 || linha == 7 || linha == 8){
            this.ocupada = true;
        }
        else this.ocupada = false;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public boolean posicaoOcupada(int linha, char coluna){
        return this.ocupada;
    }
    
}
