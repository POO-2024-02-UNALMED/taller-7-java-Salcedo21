package comunicacion;

public class Fabula extends Escrito{
    private String ensenanzas;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanzas, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanzas = ensenanzas;
        this.interpretacion = interpretacion;
    }

    public String getEnsenanza() {
        return ensenanzas;
    }

    public void setEnsenanzas(String ensenanzas) {
        this.ensenanzas = ensenanzas;
    }


    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return palabrasPagina * getPaginas();
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        return getOrigen() + "\n" +
                getTitulo() + "\n" +
                getAutor() + "\n" +
                getPaginas() + "\n" +
                ensenanzas;
    }

}
