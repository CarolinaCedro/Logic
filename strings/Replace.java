package strings;

public class Replace {

    public static void main(String[] args){

        String textOriginal = " ANA carolINA cEDro ", textModify;

        textModify = textOriginal.replace("A","E");

        System.out.println("texto original = "+textOriginal);
        System.out.println("texto modificado com replace = "+textModify);

    }
}
