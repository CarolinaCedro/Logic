package strings;

//Corta os espacos em branco nas extremidades

public class Trim {

    public static void main(String[]args){
        String textOriginal = " ANA carolINA cEDro ", textModify;

        textModify =  textOriginal.trim();
        System.out.println("texto original = -"+textOriginal+"-");
        System.out.println("texto modificado trim = -"+textModify+"-");
    }
}
