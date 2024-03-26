

package com.mycompany.canetaazul;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Natã
 * 
 * ATRIBUTOS:
 * Marca: caracter - String     -bic
 * Cor: caracter - String       -azul
 * Ponta: número real - double      -2.0
 * Carga: número inteiro - int      -50
 * Tampa: atributo lógico - boolean (true/false)        -false
 * 
 * 
 * METODO:
 * escrever
 * rabisco
 * pintar
 * tampar
 * destampar
 * 
 * Método rabiscar(); SEMPRE VAI TER ()
 * se (tampada) então
 * escrever (ERRO)
 * se não
 * escreva (Rabiscar)
 * Fim se 
 * FimMetodo
 * 
 * metodo tampar()
 * 
 * 
 * ESTADO:
 * tampada
 * 50
 * 
 * tampada = verdadeiro - (true);
 * fimMetodo}
 * fimClasse}
 * 
 * OBJETO: UMA CANETA
 * CLASSE: FORMA/MOLDE
 * 
 * c1 (esse é o objeto) = new caneta ("CANETA" é a classe);
 * 
 * c1.cor = azul
 * o atributo "cor", do objeto "c1" esta recebendo "azul"
 * 
 * EX:
 * c1.ponta = 0.5;
 * c1.tampada = false;
 * 
 * c1.escrever(); METODO SEMPRE VAI TER "()"
 * 
 * c2 = new caneta;
 * c2.cor = preta;
 * c2.ponta = 1.0;
 * c2.tampada = true;
 * c2.destampar();
 * 
 * 
 * 
 */
public class CanetaAzul {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        Scanner teclado1 = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        
        System.out.println("Digite a marca da caneta: ");
        String marcaC1 = teclado1.nextLine();
        System.out.println("Digite a cor da caneta: ");
        String corC1 = teclado1.nextLine();
        System.out.println("Digite a espessura da caneta: ");
        double pontaC1 = teclado2.nextDouble();
        System.out.println("Digite a carga da caneta: ");
        int cargaC1 = teclado2.nextInt();
        
        Caneta c1 = new Caneta();
        
        c1.marca = marcaC1;
        c1.cor = corC1;
        c1.ponta = pontaC1;
        c1.carga = cargaC1;
       
        boolean respostaTampada = c1.perguntarTampada();
        c1.tampada = respostaTampada();
        
        c1.estado();
        c1.escrever();
        
        
       /* Caneta c2 = new Caneta();
        c2.marca = "Bic";
        c2.cor = "vermelha";
        c2.destampar();
        c2.estado();
        c2.escrever(); */
    }

    private static boolean respostaTampada() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
