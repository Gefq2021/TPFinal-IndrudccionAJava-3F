public class ArmaLarga extends Arma {
    private boolean selloRENAR;
    private String descripcionUso;
    private int nivel;

    public ArmaLarga(int cantMuniciones, double alcance, String marca, int calibre, String estado, boolean selloRENAR, String descripcionUso, int nivel) {
        super(cantMuniciones, alcance, marca, calibre, estado);
        this.selloRENAR = selloRENAR;
        this.descripcionUso = descripcionUso;
        this.nivel = nivel;
    }

    public boolean isSelloRENAR() {
        return selloRENAR;
    }

    public void setSelloRENAR(boolean selloRENAR) {
        this.selloRENAR = selloRENAR;
    }

    public String getDescripcionUso() {
        return descripcionUso;
    }

    public void setDescripcionUso(String descripcionUso) {
        this.descripcionUso = descripcionUso;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String getTipoArma() {
        return "Larga";
    }
}
