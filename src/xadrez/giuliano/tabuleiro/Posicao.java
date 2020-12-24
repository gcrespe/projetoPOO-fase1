/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez.giuliano.tabuleiro;

/**
 *
 * @author gcres 
 */
public class Posicao {
    
    private int linha;
    private String coluna;
    private String cor;
    private String pecaPosicao;
    
    //inicializando as variáveis com valores que não irão comprometer a
    //execução da aplicação
    public Posicao(){
        this.coluna = " ";
        this.linha = -1;
        this.pecaPosicao = "";
    }
    
    //mapeamento da coluna para String a partir do int recebido
    public void setPosicao(int linha, int coluna){
        this.linha = linha;
        switch(coluna){
            case 0:
                this.coluna = "a";
            break;
            case 1:
                this.coluna = "b";
            break;
            case 2:
                this.coluna = "c";
            break;
            case 3:
                this.coluna = "d";
            break;
            case 4:
                this.coluna = "e";
            break;
            case 5:
                this.coluna = "f";
            break;
            case 6:
                this.coluna = "g";
            break;
            case 7:
                this.coluna = "h";
            break;
        }
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    //verificação de posição, para no futuro realizar o movimento de "comer"
    public boolean posicaoOcupada(){
        if("".equals(this.pecaPosicao)){
            return false;
        }
        return true;
    }   
    
}
