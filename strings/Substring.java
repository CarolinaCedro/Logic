package strings;

// Apenas imprime o valor restante de acordo com o indice informado

public class Substring {

    public static void main(String[] args) {
        String textOriginal = " ANA carolINA cEDro ", textModify,substringParametros;

        textModify = textOriginal.substring(6);

        System.out.println("Texto Original = "+textOriginal);
        System.out.println("Texto modificado com substring = "+textModify);

        // serve também com parametros de inicio e fim de corte

        substringParametros = textOriginal.substring(14,20);
        System.out.println("Texto Original = "+textOriginal);
        System.out.println("Texto modificado com substring = "+substringParametros);
    }
}
