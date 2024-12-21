package secao7.Pilares.Interface.abstrato;

public abstract class Animal {

    public String respirar(){
        return "CO2";
    }
    // se esse método fosse final, ele não poderia ser sobrescrito
    
    public abstract String mover();

}
