/**
 * Clase para los datos de los coches
 *
 * @author Lucia Posada
 * @version v1.0
 */
public class Coche {

    /**
     * Matricula del coche
     */
    private String matricula;
    /**
     * Marca del coche
     */
    private String marca;
    /**
     * Horas aparcadas
     */
    private int horas;

    /*public Coche(String matricula, String marca) {
        this.matricula = matricula;
        this.marca = marca;
    }*/

    /**
     * Da matricula
     *
     * @param matricula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Da marca
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Devuelve marca
     *
     * @return marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Devuelve matricula
     *
     * @return matricula
     */
    public String getMatricula() {
        return matricula;
    }

}
