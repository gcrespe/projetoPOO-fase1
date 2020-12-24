/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez.giuliano.tabuleiro;
import xadrez.giuliano.pecas.Peao;
import xadrez.giuliano.pecas.Bispo;
import xadrez.giuliano.pecas.Cavalo;
import xadrez.giuliano.pecas.Rainha;
import xadrez.giuliano.pecas.Rei;
import xadrez.giuliano.pecas.Torre;

/**
 *
 * @author gcres
 */
public class Tabuleiro {
    
    //tabuleiro com 64 posições do tipo Posicao
    public Posicao tabuleiro[][] = new Posicao[8][8];

    public Tabuleiro() {
        
        for(int linha = 0; linha < 8; linha++){
            for(int coluna = 0; coluna < 8; coluna++){
               
                tabuleiro[linha][coluna] = new Posicao();
                tabuleiro[linha][coluna].setPosicao(linha, coluna);
                
                
                //se a linha for par e a coluna também
                if(linha % 2 == 0 && coluna % 2 == 0){
                    tabuleiro[linha][coluna].setCor("preto");
                }
                //se a linha for par e a coluna impar
                else if(linha % 2 == 0 && coluna % 2 != 0){
                    tabuleiro[linha][coluna].setCor("branco");
                }
                //se a liha e a coluna forem impares
                else if(linha % 2 != 0 && coluna % 2 != 0){
                    tabuleiro[linha][coluna].setCor("preto");
                }
                //se a coluna for par e a linha impar
                else if(linha % 2 != 0 && coluna % 2 == 0){
                    tabuleiro[linha][coluna].setCor("branco");
                }
                
            }
        }
        
    }
    
    public Posicao getPosicao(int linha, int coluna){
        return this.tabuleiro[linha][coluna];
    }
    
    public void desenhar(){
        
        System.out.println("------------------TABULEIRO DE XADREZ------------------");
        System.out.println("\n");
        
        for(int i = 0; i < 8; i++){
           System.out.print("     ");
           switch(i){
               case 0:
                   System.out.print("a" + ' ');
               break;
               case 1:
                   System.out.print("b" + ' ');
               break;
               case 2:
                   System.out.print("c" + ' ');
               break;
               case 3:
                   System.out.print("d" + ' ');
               break;
               case 4:
                   System.out.print("e" + ' ');
               break;
               case 5:
                   System.out.print("f" + ' ');
               break;
               case 6:
                   System.out.print("g" + ' ');
               break;
               case 7:
                   System.out.print("h" + ' ');
               break;
           }
        }
        
        System.out.println("\n");
        
        //loop que retorna as cores atribuidas a cada posição do tabuleiro,
        //para facilitar a visualização e os testes
        for(int i = 8; i > 0; i--){
            System.out.print(i + "    ");
            for(int j = 0; j < 8; j++)
                System.out.print(getPosicao(i-1, j).getCor() + " ");
            
            System.out.println("");
            System.out.println("");
        }

    }

    public boolean posicaoOcupada(int linha, char coluna){
        return tabuleiro[linha][coluna].posicaoOcupada();
    }
    
    public boolean Checar(int linhaOri, int linhaDest, String colunaOri, String colunaDest, String cor, String peca){
        int colunaDestino = 0, colunaOrigem = 0;
        
        //setando colunaOrigem a partir de colunaOri, mapeando o char para int
        if("a".equals(colunaOri)){
            colunaOrigem = 1;
        }
        if("b".equals(colunaOri)){
            colunaOrigem = 2;
        }
        if("c".equals(colunaOri)){
            colunaOrigem = 3;
        }
        if("d".equals(colunaOri)){
            colunaOrigem = 4;
        }
        if("e".equals(colunaOri)){
            colunaOrigem = 5;
        }
        if("f".equals(colunaOri)){
            colunaOrigem = 6;
        }
        if("g".equals(colunaOri)){
            colunaOrigem = 7;
        }
        if("h".equals(colunaOri)){
            colunaOrigem = 8;
        }
        
        //setando colunaDestino com base em colunaDest, mapeando o char para int
        if("a".equals(colunaDest)){
            colunaDestino = 1;
        }
        if("b".equals(colunaDest)){
            colunaDestino = 2;
        }
        if("c".equals(colunaDest)){
            colunaDestino = 3;
        }
        if("d".equals(colunaDest)){
            colunaDestino = 4;
        }
        if("e".equals(colunaDest)){
            colunaDestino = 5;
        }
        if("f".equals(colunaDest)){
            colunaDestino = 6;
        }
        if("g".equals(colunaDest)){
            colunaDestino = 7;
        }
        if("h".equals(colunaDest)){
            colunaDestino = 8;
        }
        
        //verificações dos limites do tabuleiro
        if(linhaOri > 8 || linhaOri < 1){
           return false;
        }
        if(linhaDest > 8 || linhaDest < 1){
           return false;
        }
        if(colunaOrigem > 8 || colunaOrigem < 1){
           return false;
        }
        if(colunaDestino > 8 || colunaDestino < 1){
           return false;
        }
        
        
        //verificações condicionais para cada tipo de peça recebido como
        //parametro. Cada peça executa sua própria verificação de movimento.
        
        if("p".equals(peca) || "P".equals(peca)){
            Peao peao = new Peao(cor);
            boolean retorno = peao.checaMovimento(linhaOri, linhaDest, colunaOrigem, colunaDestino);
            return retorno;
        }
        if("b".equals(peca) || "B".equals(peca)){
            Bispo bispo = new Bispo(cor);
            boolean retorno = bispo.checaMovimento(linhaOri, linhaDest, colunaOrigem, colunaDestino);
            return retorno;
        }
        if("c".equals(peca) || "C".equals(peca)){
            Cavalo cavalo = new Cavalo(cor);
            boolean retorno = cavalo.checaMovimento(linhaOri, linhaDest, colunaOrigem, colunaDestino);
            return retorno;
        }
        if("q".equals(peca) || "Q".equals(peca)){
            Rainha rainha = new Rainha(cor);
            boolean retorno = rainha.checaMovimento(linhaOri, linhaDest, colunaOrigem, colunaDestino);
            return retorno;
        }
        if("t".equals(peca) || "T".equals(peca)){
            Torre torre = new Torre(cor);
            boolean retorno = torre.checaMovimento(linhaOri, linhaDest, colunaOrigem, colunaDestino);
            return retorno;
        }
        if("r".equals(peca) || "R".equals(peca)){
            Rei rei = new Rei(cor);
            boolean retorno = rei.checaMovimento(linhaOri, linhaDest, colunaOrigem, colunaDestino);
            return retorno;
        }
        return false;
    }
    
}

