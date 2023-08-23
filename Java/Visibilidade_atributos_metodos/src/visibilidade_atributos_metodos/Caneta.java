/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visibilidade_atributos_metodos;

/**
 *
 * @author alexs
 */
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status() {
        System.out.println("O modelo desta caneta é: " + this.modelo);
        System.out.println("A cor desta caneta é: " + this.cor);
        System.out.println("O tamanho de ponta é: " + this.ponta);
        System.out.println("A caneta está com carda de " + this.carga + "%");
        System.out.println("A caneta esta tampada? " + this.tampada);
    }
    
    private void rabiscar(){
        if (tampada == true) {
            System.out.println("Erro não é permitido que você rabisque!");
        }
        else {
            System.out.println("Você pode rabiscar!");
        }
    }
    
    public void tampar(){
        this.tampada = true;
        System.out.println("Verdadeiro");
    }
    
    public void destampar(){
        this.tampada = false;
        System.out.println("false");
    }
    
}
