package strings;

// Procura um determinado caracter e modifica pelo segundo parametro passado

public class ReplacePalavras {

    public static void main(String[] args){

        String textOriginal = " ANA carolINA cEDro ", textModify;

        textModify = textOriginal.replace("cEDro","Linda <3");

        System.out.println("texto original = "+textOriginal);
        System.out.println("texto modificado = "+textModify);

    }
}
