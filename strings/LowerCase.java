package strings;

// Deixa todas as letras minusculas

public class LowerCase {

    public static void main(String[] args) {
        String textOriginal = "ANA carolINA cEDro ", textModify;

        textModify = textOriginal.toLowerCase();

        System.out.println("texto original = "+textOriginal);
        System.out.println("texto modificado = "+textModify);
    }
}
