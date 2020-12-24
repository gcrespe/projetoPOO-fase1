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
public class Peao extends Peca{

    public boolean primeiro = true;

    public Peao(String cor){
        super(cor);
    }
    
 
    @Override
    public String desenho(){
        if(this.getCor() == "branco"){
            return "p";
        }else return "P";
    }
    
    void setPrimeiro(boolean pri){
        this.primeiro = pri;
    }
    
    //a movimentação do peão consiste em um movimento especial na primeira jogada
    //quando é possível mover duas casas na mesma linha em um unico movimento.
    //além da primeira jogada, só pode andar uma linha a mais e, quando existir
    // o movimento de "comer", irá fazer o movimento diagonalmente.
    // por hora o movimento está habilitado sem verificação apenas para que possa
    //ser testado
    @Override
    public boolean checaMovimento(int linhaOri, int linhaDest, int colunaOri, int colunaDest){
        if(this.getCor() == "branco"){
            if(Math.abs(linhaDest - linhaOri) == 2){
                if(this.primeiro && colunaOri == colunaDest){
                    setPrimeiro(false);
                    return true;
                }else return false;
            }
            else if((colunaOri == colunaDest && Math.abs(linhaDest - linhaOri) == 1) || Math.abs(colunaDest = colunaOri) == 1){
                return true;
            }
            else return false;
        }
        else{
            if(Math.abs(linhaOri - linhaDest) == 2){
                if(this.primeiro && colunaOri == colunaDest){
                    setPrimeiro(false);
                    return true;
                }else return false;
            }
            else if((colunaOri == colunaDest && Math.abs(linhaOri - linhaDest) == 1) || Math.abs(colunaDest = colunaOri) == 1){
                return true; 
            }
            else return false;
        }
    }
    
}
