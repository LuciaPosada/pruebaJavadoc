import javax.swing.JOptionPane;

/**
 * Clase con las operaciones del garaje
 *
 * @author Lucia Posada
 * @version v1.0
 */
public class Garaje {

    /**
     * Numero de plazas que tiene el aparcamiento
     */
    private static final int MAX_COCHES = 5;
    /**
     * Numero de coches que estan aparcados
     */
    private static int numeroCoches = 0;
    /**
     * Coche
     */
    private Coche coche;

    /**
     * Comprueba si hay plazas disponibles, y en caso de haberlas, aparca un nuevo coche
     * y introduce su datos
     */
    public void aparcar() {

        if (numeroCoches != MAX_COCHES) {
            System.out.println("PLAZAS DISPOÑIBLES");
            coche = darAltaCoche();
            numeroCoches++;
        } else if (numeroCoches == MAX_COCHES) {
            System.out.println("COMPLETO");
        }

    }

    /**
     * Comprueba si hay algun coche que desaparcar, y de ser ese el caso, reduce
     * el numero de coches aparcados, pide que se page el importe del ticket y
     * muestra la factura
     */
    public void desaparcar() {

        if (numeroCoches <= 0) {
            System.out.println("APARCADOIRO LIBRE");
        } else {

            numeroCoches--;

            float importe = calcularTicket(coche);
            float pagoTotal = 0;

            do {

                JOptionPane.showMessageDialog(null, "Importe: " + importe);
                float pago = Float.parseFloat(JOptionPane.showInputDialog("Introduza el pago"));

                importe = importe - pago;
                pagoTotal += pago;

            } while (importe > 0);

            float cambio = pagoTotal - importe;

            JOptionPane.showMessageDialog(null,
                    "FACTURA\n" +
                            "MATRICULA COCHE ........" + coche.getMatricula() + "\n" +
                            "TEMPO ................." + generarHorasAparcado() + " h\n" +
                            "PRECIO..............." + calcularTicket(coche) + " €\n" +
                            "CARTOS RECIBIDOS..........." + pagoTotal + " €\n" +
                            "CARTOS DEVOLTOS............" + cambio + " €\n" +
                            "\n" +
                            "GRACIAS POR USAR O NOSO APARCADOIRO ");

        }
    }

    /**
     * Crea un coche
     *
     * @return coche creado
     */
    public static Coche darAltaCoche() {

        Coche obxC = new Coche();

        obxC.setMatricula(JOptionPane.showInputDialog("Tecle a matricula"));
        obxC.setMarca(JOptionPane.showInputDialog("Tecle a marca"));

        return obxC;
    }

    /**
     * Calcula la cantidad a pagar segun las horas que ha pasado el cohe aparcado
     *
     * @param coche
     * @return la cantidad a pagar
     */
    public float calcularTicket(Coche coche) {

        int horas = generarHorasAparcado();

        float total;

        if (horas <= 3) {
            total = (float) 1.5;
        } else {
            total = (float) ((horas - 3) * 0.20 + 1.5);
        }

        return total;
    }

    /**
     * Genera (de entre 24) una hora aleatoriamemte
     */
    public int generarHorasAparcado() {

        return (int) (Math.random() * 24);
    }

}
