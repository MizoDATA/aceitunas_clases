package alboran;

import javax.swing.JOptionPane;

public class Funciones {

    // constantes de clase para tamaño
    public static final String ALORENA = "aloreña";
    public static final String PICUAL = "picual";
    public static final String HOJIBLANCA = "hojiblanca";
    // constantes de clase para tamaño aceitunas
    public static final String FINA = "fina";
    public static final String GRUESA = "gruesa";

    public static int pedirOpcion(){
        int opcion = 0;
        String opcionString;
        opcionString = JOptionPane.showInputDialog(Mensajes.menuInicial);
        opcion = Integer.parseInt(opcionString);
        return opcion;
    }

    // Función para pedir el tipo de aceituna
    // Devuelve un tipo de los tres posibles
    public static String pedirTipoAceituna(){
        String tipo="";
        do{
            tipo = JOptionPane.showInputDialog("Introduce un tipo de los posibles (picual, aloreña, hojiblanca)");
        } while(!tipo.equalsIgnoreCase(HOJIBLANCA)&&!tipo.equalsIgnoreCase(ALORENA)&&!tipo.equalsIgnoreCase(PICUAL));
       
        return tipo;
    }

    // metodo para pedir tamaño de aceitunas
    public static int pedirTamanio() {
        int tamanioInt = 0;
        String tamanio;

        do{

            tamanio = JOptionPane.showInputDialog("Introduce el tamaño de las aceitunas 1(fina) 2(gruesa)");
        }while(!tamanio.equalsIgnoreCase("fina") && !tamanio.equalsIgnoreCase("gruesa"));

        tamanioInt = tamanio.equalsIgnoreCase("gruesa")?  1 : 2;


        return tamanioInt;
        
    }
}
