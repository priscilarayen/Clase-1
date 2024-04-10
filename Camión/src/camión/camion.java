
package camión;

public class camion {
    String marca;
    String modelo;
    int anio;
    boolean revisionTecnica;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int año) {
        this.anio = año;
    }

    public boolean getRevisionTecnica() {
        return revisionTecnica;
    }

    public void setRevisionTecnica(boolean revisionTecnica) {
        this.revisionTecnica = revisionTecnica;
    }

    @Override
    public String toString() {
        return "camion: marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", revisionTecnica=" + revisionTecnica + '}';
    }
    
    
    
}
