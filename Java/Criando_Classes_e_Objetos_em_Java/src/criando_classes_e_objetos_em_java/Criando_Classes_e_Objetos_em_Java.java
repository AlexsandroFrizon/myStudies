package criando_classes_e_objetos_em_java;

public class Criando_Classes_e_Objetos_em_Java {

    public static void main(String[] args) {
        //Instancia do objeto caneta
        Caneta c1 = new Caneta();
        
        //Todos os atributos do objeto caneta c1
        c1.cor = "Azul";
        c1.modelo = "Bic - Caneta mágica";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.carga = 90;
        
        //Escrevendo no console os atributos 
        System.out.println("A cor da caneta é: " + c1.cor);
        System.out.println("O modelo da caneta é: " + c1.modelo);
        System.out.println("O tamanho da ponta desta caneta é: " + c1.ponta);
        System.out.println("A carga atual desta caneta está em " + c1.carga + "%");
        
        //Escrevendo no console os atributos com o método status
        System.out.println("\n");   
        System.out.println("**************************************");
        System.out.println("\n");
        System.out.println("Esses são os status da sua caneta: C1 ");
        c1.status();
        
        //Escrevendo no console os atributos com o método rabiscar
        System.out.println("\n");   
        System.out.println("**************************************");
        System.out.println("\n");
        System.out.println("A sua caneta esta? " + c1.tampada);
        c1.rabiscar();
    }
    
}
