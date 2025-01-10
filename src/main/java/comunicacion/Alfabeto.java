package comunicacion;

public class Alfabeto extends Pictograma{
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String interpretacion, String[] letras) {
        super(origen);
        this.interpretacion = interpretacion;
        this.letras = letras;
    }
    

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public Integer cantidadLetras(){
        return letras.length;
    }

    @Override
    String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        if (letras == null || letras.length == 0) {
            return "";
        }

        String strLetras = letras[0];

        for (int i = 1; i < letras.length; i++) {
            strLetras += ", " + letras[i];
        }

        return strLetras;
    }

}
