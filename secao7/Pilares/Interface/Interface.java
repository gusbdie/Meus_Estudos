package secao7.Pilares.Interface;

public interface Interface {

    //por padrão, na interface, a visibilidade é public
    // e todos os métodos são abstratos(não tem corpo)
    void metodo(); // todas classes que implemets Interface
                   // precisam ter esse método
    
    // uma classe pode herdar só uma outra classe mas
    //ter várias interfaces

    default int velocidadeDoAr(){
        return 1;
    }
    //não precisa implementar nas outras classes
}

