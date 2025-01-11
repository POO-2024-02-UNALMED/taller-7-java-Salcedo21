package comunicacion;

public class Periodico extends Escrito{
    private String fecha;
    private String primicia;
    private String interpretacion;

    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia,String interpreatcion) {
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.interpretacion = interpreatcion;
        this.primicia = primicia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setInterpreatcion(String interpreatcion) {
        this.interpretacion = interpreatcion;
    }

    public String getPrimicia() {
        return primicia;
    }

    public void setPrimicia(String primicia) {
        this.primicia = primicia;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return palabrasPagina * 10 * getPaginas();
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
                fecha + "\n" +
                primicia;
    }
}
