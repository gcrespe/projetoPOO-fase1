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
public class Rei extends Peca{
    
    public Rei(String cor){
        super(cor);
    }

    @Override
    public String desenho(){
        if(this.getCor() == "branco"){
            return "r";
        }else return "R";
    }
    
    //o rei anda apenas uma direção, então basta fazer a verificação se qualquer 
    // um entre a coluna ou a linha foi alterado em apenas 1 unidade
    @Override
    public boolean checaMovimento(int linhaOri, int linhaDest, int colunaOri, int colunaDest){
        if(Math.abs(linhaDest - linhaOri) == 0 || Math.abs(linhaDest - linhaOri) == 1){
            if(Math.abs(colunaDest - colunaOri) == 1 || Math.abs(colunaDest - colunaOri) == 0){
                return true;
            }
        }
        return false;
    }
    
}
