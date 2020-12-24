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
public class Cavalo extends Peca {
    
    public Cavalo(String cor){
        super(cor);
    }
    
    @Override
    public String desenho(){
        if(this.getCor() == "branco"){
            return "c";
        }else return "C";
    }
    
    // o movimento do cavalo consiste em ter dois valores alternantes: 
    // se as colunas diferirem em 1, a linha deve diferir em 2 e vice versa
    @Override
    public boolean checaMovimento(int linhaOri, int linhaDest, int colunaOri, int colunaDest){
       if(Math.abs(linhaDest - linhaOri) == 1){
           if(Math.abs(colunaDest - colunaOri) == 1){
               return false;
           }
           else if(Math.abs(colunaDest - colunaOri) == 2){
               return true;
           }
       }
       else if(Math.abs(linhaDest - linhaOri) == 2){
           if(Math.abs(colunaDest - colunaOri) == 1){
               return true;
           }
           else if(Math.abs(colunaDest - colunaOri) == 2){
               return false;
           }
       }
       return false;
    }
    
}
