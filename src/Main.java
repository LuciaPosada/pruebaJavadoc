import javax.swing.JOptionPane;

/**
 * Clase main donde se elije que operacion realizar
 *
 * @author Lucia Posada
 * @version v1.0
 */

public class Main {

    public static void main(String[] args) {

        boolean cerrarPrograma = false;

        Garaje obxG = new Garaje();

        do {

            String opcion = JOptionPane.showInputDialog("Telcee a operacion a realizar \n-Salir\n-Aparcar\n-Desaparcar");

            switch (opcion) {
                case "Salir":
                    cerrarPrograma = true;
                    break;
                case "Aparcar":
                    obxG.aparcar();
                    break;
                case "Desaparcar":
                    obxG.desaparcar();
                    break;
                default:
                    cerrarPrograma = true;
                    break;
            }

        } while (!cerrarPrograma);

    }

}

