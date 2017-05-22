/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOGO;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
       
        Scanner Entrada = new Scanner(System.in);
        JV jogo = new JV();
        String posicao;
        int valida = 0;
        int jogadas = 0;
        
        while(true){                   
            System.out.println("JOGO DA VELHAAAAAAAA");
            System.out.println(jogo.Mostrar());
                     
             do{//inicia jogador 1
                System.out.println("Jogador 1 onde vc vai jogar????");
                posicao = Entrada.next();
                while(!jogo.Valido(posicao)){
                    System.out.println("Jogada inválida, tente dnv");
                    System.out.println("Jogador 1 onde vc vai jogar????");
                    posicao = Entrada.next();
                    valida = 0;
                }
                jogo.Jogada(posicao, "x");
                valida = 1;
            }while(valida == 0);//fim jogadir 1
            
            jogadas++;
            valida = 0;
            System.out.println(jogo.Mostrar());
            
            if(!(jogo.Ganhou(jogadas)==("null"))){
                break;
            }
             do{//inicia jogador 2
                System.out.println("Jogador 2 onde vc vai jogar????");
                posicao = Entrada.next();
                while(!jogo.Valido(posicao)){
                    System.out.println("Jogada inválida, tente dnv");
                    System.out.println("Jogador 2 onde vc vai jogar????");
                    posicao = Entrada.next();
                    valida = 0;
                }
                jogo.Jogada(posicao, "0");
                valida = 1;
            }while(valida ==0);//fim jogador 2   
             
            jogadas++;
            valida = 0;
            System.out.println(jogo.Mostrar());
            
            if(!jogo.Ganhou(jogadas).equals("null")){
                break;
            }
        }///////////////////////////////////////////////////////////////////////
        System.out.println(" O " + jogo.Ganhou(jogadas) + " ganhou");
    }    
    //Tá uma bosta, lembrar de ajeitar essa classe teste tem muita porcaria que não era pra tá aí
}
