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
public class Bispo extends Peca{
    
    public Bispo(String cor){
        super(cor);
    }

    @Override
    public String desenho(){
        if(this.getCor() == "branco"){
            return "b";
        }else return "B";
    }
    
    @Override
    public boolean checaMovimento(int linhaOri, int linhaDest, int colunaOri, int colunaDest){
        return Math.abs(linhaDest - linhaOri) == Math.abs(colunaDest - colunaOri);
    }
    
}
