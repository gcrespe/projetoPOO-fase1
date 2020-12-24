/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez.giuliano.pecas;

/**
 *
 * @author gcres
 * 
 * Classe responsável pela representação da peça Rainha no jogo.
 */
public class Rainha extends Peca{
    
    public Rainha(String cor){
        super(cor);
    }
    
    @Override
    public String desenho(){
        if(this.getCor() == "branco"){
            return "q";
        }else return "Q";
    }
    
   
    @Override
    public boolean checaMovimento(int linhaOri, int linhaDest, int colunaOri, int colunaDest){
        if(Math.abs(linhaDest - linhaOri) - Math.abs(colunaDest - colunaOri) == 0){// se o deslocamento de linhas for o mesmo que o de colunar
            return true;
        }
        else if(colunaOri != colunaDest && linhaOri == linhaDest){ // se as colunas forem diferentes mas as linhas iguais
            return true;
        }
        else if(colunaOri == colunaDest && linhaOri != linhaDest){// se as linhas forem diferentes mas as colunas iguais
            return true;
        }
        return false;
    }
    
}
