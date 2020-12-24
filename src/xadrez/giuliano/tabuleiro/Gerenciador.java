/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez.giuliano.tabuleiro;
import java.util.Scanner;

/**
 *
 * @author gcres
 * 
 * Classe principal, responsável pela execução do programa no geral.
 * 
 */
public class Gerenciador {
    
    public static void main(String[] args){
        //atributos inicializados com valores que não influenciarão na execução do programa
        int opcao;
        int linhaOri = 0, linhaDes = 0;
        String colunaOri = "", colunaDes = "";
        String corPeca;
        corPeca = "";
        Jogo jogo = new Jogo();
        
        //scanner para poder capturar as entradas do teclado
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.println("       1 - testar Peao                          ");
            System.out.println("       2 - testar Cavalo                        ");
            System.out.println("       3 - testar Rainha                        ");
            System.out.println("       4 - testar Bispo                         ");
            System.out.println("       5 - testar Rei                           ");
            System.out.println("       6 - testar Torre                         ");
            System.out.println("       7 - Ver tabuleiro                        ");
            System.out.println("       0 - Sair                                 ");
            
            System.out.print("\nDigite a opção desejada: ");
            opcao = scanner.nextInt();
            
            if(opcao != 0 && opcao <= 7){
                
                if(opcao != 7){
                    System.out.print("\nDigite a linha de origem: (deve ser um número): ");
                    linhaOri = scanner.nextInt();

                    System.out.print("\nDigite a coluna de origem: (deve ser uma letra): ");
                    colunaOri = scanner.next();

                    System.out.print("\nDigite a linha destino: (deve ser um número): ");
                    linhaDes = scanner.nextInt();

                    System.out.print("\nDigite a coluna destino: (deve ser uma letra): ");
                    colunaDes = scanner.next();

                    System.out.print("\nDigite a cor da peça: (branco para a cor branca e preto para a cor preta): ");
                    corPeca = scanner.next();
                }
                
                //para cada opção, o parametro especifico da peça testada é passado para a classe jogo, que irá passar
                //para a classe tabuleiro e, por fim, para a própria classe peça fazer sua verificação.
                if(opcao == 1){
                    if(jogo.testePecas(linhaOri, colunaOri, linhaDes, colunaDes, corPeca, "p") == true){
                        System.out.println("Movimento válido, posição: " + "(" + linhaDes + " , "+ colunaDes + ")");
                    }
                    else if(jogo.testePecas(linhaOri, colunaOri, linhaDes, colunaDes, corPeca, "p") == false){
                        System.out.println("Movimento inválido");
                    }
                }
                else if(opcao == 2){
                    if(jogo.testePecas(linhaOri, colunaOri, linhaDes, colunaDes, corPeca, "c") == true){
                        System.out.println("Movimento válido, posição: " + "(" + linhaDes + " , "+ colunaDes + ")");
                    }
                    else if(jogo.testePecas(linhaOri, colunaOri, linhaDes, colunaDes, corPeca, "c") == false){
                        System.out.println("Movimento inválido");
                    }
                }
                else if(opcao == 3){
                    if(jogo.testePecas(linhaOri, colunaOri, linhaDes, colunaDes, corPeca, "q") == true){
                        System.out.println("Movimento válido, posição: " + "(" + linhaDes + " , "+ colunaDes + ")");
                    }
                    else if(jogo.testePecas(linhaOri, colunaOri, linhaDes, colunaDes, corPeca, "q") == false){
                        System.out.println("Movimento inválido");
                    }
                }
                else if(opcao == 4){
                    if(jogo.testePecas(linhaOri, colunaOri, linhaDes, colunaDes, corPeca, "b") == true){
                        System.out.println("Movimento válido, posição: " + "(" + linhaDes + " , "+ colunaDes + ")");
                    }
                    else if(jogo.testePecas(linhaOri, colunaOri, linhaDes, colunaDes, corPeca, "b") == false){
                        System.out.println("Movimento inválido");
                    }
                }
                else if(opcao == 5){
                    if(jogo.testePecas(linhaOri, colunaOri, linhaDes, colunaDes, corPeca, "r") == true){
                        System.out.println("Movimento válido, posição: " + "(" + linhaDes + " , "+ colunaDes + ")");
                    }
                    else if(jogo.testePecas(linhaOri, colunaOri, linhaDes, colunaDes, corPeca, "r") == false){
                        System.out.println("Movimento inválido");
                    }
                }
                else if(opcao == 6){
                    if(jogo.testePecas(linhaOri, colunaOri, linhaDes, colunaDes, corPeca, "t") == true){
                        System.out.println("Movimento válido, posição: " + "(" + linhaDes + " , "+ colunaDes + ")");
                    }
                    else if(jogo.testePecas(linhaOri, colunaOri, linhaDes, colunaDes, corPeca, "t") == false){
                        System.out.println("Movimento inválido");
                    }
                }
                else if(opcao == 7){
                    jogo.tabuleiro.desenhar();
                }
                else System.out.println("Opção inválida");
            }
        }while(opcao != 0);
    }
    
}
