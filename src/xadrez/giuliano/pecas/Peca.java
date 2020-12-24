/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez.giuliano.pecas;

/**
 *
 * @author gcres
 */
public abstract class Peca {
    
    public boolean capturado = false;
    private String cor;
    
    
    Peca(String cor){
        this.cor = cor;
    }
    
    protected String getCor(){
        return this.cor;
    }
    
    public abstract String desenho();
    
    public abstract boolean checaMovimento(int linhaOri, int linhaDest, int colunaOri, int colunaDest);
}
