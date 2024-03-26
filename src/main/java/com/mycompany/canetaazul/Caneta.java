
package com.mycompany.canetaazul;

import java.util.Scanner;

/**
 *
 * @author Natã
 */
public class Caneta {
    
    String marca;
    String cor;
    Double ponta;
    int carga;
    boolean tampada;
    
    void estado(){
        System.out.println("Informações da Caneta ");
        System.out.println("Cor: " + this.cor);
        System.out.println("Marca: " + this.marca);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Ela está tampada? " + (this.tampada ? "Sim" : "Não"));
        System.out.println();
    }
    void escrever(){
        if(this.tampada==true){
            System.out.println("Não posso escrever, está tampada!");
           
        } else { 
            System.out.println("Agora posso escrever, está destampada!");
        }
        
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
    
    void carga(){
        this.carga = 50;
    }
    
    boolean perguntarTampada(){
        Scanner teclado = new Scanner (System.in);
        System.out.println("A caneta está tampada? (Sim/Não)");
        String resposta = teclado.nextLine().toLowerCase();
        
        if(resposta.equals("sim")){
            return true;
                        
        }else if (resposta.equals("não") || resposta.equals("nao")){
            return false;
        }else{
            System.out.println("Resposta Inválida, por favor digite 'sim' ou 'não'");
            return perguntarTampada();
        }
        
        
        
    }
    
}
