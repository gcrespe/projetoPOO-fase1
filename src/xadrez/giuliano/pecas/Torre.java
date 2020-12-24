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
public class Torre extends Peca {

    public Torre(String cor){
        super(cor);
    }
    
    @Override
    public String desenho(){
        if(this.getCor() == "branco"){
            return "t";
        }else return "T";
    }
    
    //a torre se movimenta em linha reta, então basta checar se apenas a linha
    // ou a coluna mudou
    @Override
    public boolean checaMovimento(int linhaOri, int linhaDest, int colunaOri, int colunaDest){
       if(linhaOri == linhaDest && colunaOri != colunaDest || linhaOri != linhaDest && colunaOri == colunaDest){
           return true;
       }
       return false;
    }
    
}
