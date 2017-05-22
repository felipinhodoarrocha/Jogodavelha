/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOGO;

public class JV {
    
    String[][] m = { {"1","2","3"},{"4","5","6"},{"7","8","9"} }; 
    
    public String Mostrar(){
       
        String l = "";
        for(int i =0;i <3;i++){
            for(int j =0;j <3;j++){               
                l = l + "  " + (m[i][j]);
            }
            l = l + "\n";
        }
        return l;
    }
////////////////////////////////////////////////////////////////////////////////
    
    public boolean Valido(String p){
        for(int i =0;i <3;i++){
            for(int j =0;j <3;j++){
                if(m[i][j].equals(p)){
                   return true;  
                }                
            }
        }
         return false;     
    }
 ///////////////////////////////////////////////////////////////////////////////
 //onde p é a posicão na matriz e j o elemento x ou 0
    public String Jogada(String p, String j){
        String l = " fas" ;    
        
        if(p.equals("1")){
            m[0][0] = j;
        }else if(p.equals("2")){
            m[0][1] = j;
        }else if(p.equals("3")){
            m[0][2] = j;
        }else if(p.equals("4")){
            m[1][0] = j;
        }else if(p.equals("5")){
            m[1][1] = j;
        }else if(p.equals("6")){
            m[1][2] = j;
        }else if(p.equals("7")){
            m[2][0] = j;
        }else if(p.equals("8")){
            m[2][1] = j;
        }else if(p.equals("9")){
            m[2][2] = j;
        }
        ///////Particularidade do Teste
        else if(!p.equals("9") && !p.equals("8") && !p.equals("7") && !p.equals("6") 
                && !p.equals("5") && !p.equals("4") && !p.equals("3") && !p.equals("2")
                && !p.equals("1")){
            l = "número inválido";
        }
        
        return l;
    }
 ///////////////////////////////////////////////////////////////////////////////
    public  String Ganhou(int jogadas){
        
        String [] T = new String[8];
        String vencedor = "null";
        
        if(jogadas == 9){
            vencedor = "OPS, deu velha ngm";
        }
        //linha
        T[0] = m[0][0] + m[0][1] + m[0][2];
        T[1] = m[1][0] + m[1][1] + m[1][2];
        T[2] = m[2][0] + m[2][1] + m[2][2];
        //coluna
        T[3] = m[0][0] + m[1][0] + m[2][0];
        T[4] = m[0][1] + m[1][1] + m[2][1];
        T[5] = m[0][2] + m[1][2] + m[2][2];
        //Diagonal
        T[6] = m[0][0] + m[1][1] + m[2][2];
        T[7] = m[0][2] + m[1][1] + m[2][0];
        
        for(int i = 0; i < T.length;i++){
            if(T[i].equals("xxx")){
                vencedor = " Jogador 1";
            }else if(T[i].equals("000")){
                vencedor = " Jogador 2";
            }
        }
        return vencedor;
    }
    
}
