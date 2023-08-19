/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criando_classes_e_objetos_em_java;

/**
 *
 * @author alexs
 */
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void rabiscar(){
        if (tampada == true) {
            System.out.println("Você não pode rabiscarm a caneta está tampada");
        }
        else {
            System.out.println("Rabiscando");
        }
    }
    
    void tampar (){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
    
    void status(){
        System.out.println("A cor da caneta é: " + this.cor);
        System.out.println("O modelo da caneta é: " + this.modelo);
        System.out.println("O tamanho da ponta desta caneta é: " + this.ponta);
        System.out.println("A carga atual desta caneta está em " + this.carga + "%");
    }
            
            
}
