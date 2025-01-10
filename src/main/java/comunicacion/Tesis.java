package comunicacion;

import java.util.Arrays;

public class Tesis extends Escrito{
    private String idea;
    private String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion,String referencias, String interpretacion ) {
        super(origen, titulo, autor, paginas);
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.idea = idea;
        this.interpretacion = interpretacion;
        this.referencias = referencias;
    }

    public String[] getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(String[] argumentos) {
        this.argumentos = argumentos;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    @Override
    int palabrasTotales(int palabrasPagina) {
        return palabrasPagina * 5 * getPaginas();
    }

    @Override
    String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        return getOrigen() + "\n" +
                getTitulo() + "\n" +
                getAutor() + "\n" +
                getPaginas() + "\n" +
                idea + "\n" +
                Arrays.toString(argumentos) + "\n" +
                conclusion + "\n" +
                referencias;
    }
}
