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
public class Visibilidade_atributos_metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
//      c1.ponta = 0.5f; Não posso usar pois, o atributo ponta é privated da 
//      classe caneta
        c1.modelo = "Caneta mágica";
        c1.carga = 90;
//      c1.tampada = true;
        
        
//        c1.status();
        
//       c1.rabiscar(); Não posso usar pois, o atributo ponta é privated da 
//       classe caneta
        
//      Consigo usar esse metodo pois ele é publico, o atributo é privado porem 
//      como pampada faz parte da classe caneta e tampar é publico eu tenho 
//      acesso ao atributo privado tampada
        System.out.println("atributo da caneta: ");
        c1.tampar();
        c1.destampar();
    }
    
}
