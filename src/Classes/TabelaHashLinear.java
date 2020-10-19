/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

public class TabelaHashLinear {
     private int colisoes = 0;   
     int m;
     int[] hash;
     
     private int funcao(int chave,int i){
         return (chave + i) % m;
     }
     
     public TabelaHashLinear(int m){
         this.m = m;
         this.hash = new int[m];
         
         for (int j=0; j<m; j++){
             hash[j] = -1;
         }
     }
     
     public void insere (int chave){
         int i=0;
         int posicao = funcao(chave,i);
         while (hash[posicao]!= -1 && i<m){
             colisoes++;
             i++;
             posicao = funcao(chave,i);
         }
         hash[posicao] = chave;
         }
    
    
     public int busca(int chave){
         int i=0;
         int posicao = funcao(chave,i);
         while (hash[posicao] != chave && i<m){
             i++;
             posicao = funcao(chave,i);
         }
         return hash[posicao];
     }

    /**
     * @return the colisoes
     */
    public int getColisoes() {
        return colisoes;
    }
     
     
}
