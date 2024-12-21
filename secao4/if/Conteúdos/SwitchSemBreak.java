public class SwitchSemBreak {
    public static void main(String[] args) {
        
        String faixa = "marrom";

        switch(faixa.toLowerCase()){
            case "preta":
                System.out.println("Sei tal ataque1");
            case "marrom":
                System.out.println("Sei tal ataque2");
            case "roxa":
                System.out.println("Sei tal ataque3");
            case "verde":
                System.out.println("Sei tal ataque4");
            default:
                System.out.println("Sei atauqe básico");
        }

    }
}
