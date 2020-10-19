package com.xadrez.tabuleiro;

import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gcres
 */

public abstract class Piso {
    
   int coordenadas;
  
   private static Map<Integer, PisoVazio> PISOS_VAZIOS = criarPisos();
   
   private static Map<Integer, PisoVazio> criarPisos(){
       
       final Map<Integer, PisoVazio> pisosVazios = new HashMap<>();
       
       for(int i = 0; i<64; i++){
           pisosVazios.put(i, new PisoVazio(i));
       }
       
       return pisosVazios;
               
   }
   
   public static Piso ocuparPiso(int coordenadas){
       return new PisoOcupado(coordenadas);
   }
   
    
   Piso(int coordenadas){
       setCoordenadas(coordenadas);
   }
   
   void setCoordenadas(int coordendas){
       this.coordenadas = coordenadas;
   }
    
   public abstract boolean pisoOcupado();
   
   public static class PisoVazio extends Piso{
       
       PisoVazio(int coordenadas){
           super(coordenadas);
       }
       
       @Override
       public boolean pisoOcupado(){
           return false;
       }
   }
   
   public static class PisoOcupado extends Piso{
       
       PisoOcupado(int coordenadas){
           super(coordenadas);
       }
       
       @Override
       public boolean pisoOcupado(){
           return true;
       }
   }
   
}
