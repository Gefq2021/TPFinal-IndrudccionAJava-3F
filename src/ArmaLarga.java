public class ArmaLarga extends Arma implements Comparable {
    private boolean selloRENAR;
    private String descripcionUso;
    private int nivel;

    public ArmaLarga(Policia policia ,int cantMuniciones, double alcance, String marca, int calibre, String estado, boolean selloRENAR, String descripcionUso, int nivel) {
        super(policia, cantMuniciones, alcance, marca, calibre, estado);
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

    @Override
    public int compareTo(Object arma) {
        ArmaLarga otraArma = (ArmaLarga) arma;
        return Integer.compare(this.nivel, otraArma.nivel);
    }

    @Override
    public String toString() {
        return "\nDATOS DEL ARMA:" + "\nTipo de Arma: " + getTipoArma() + "\n" + super.getPolicia() + "\nCantidad de Municiones: " + super.getCantMuniciones() + "\nAlcance: " + super.getAlcance() + "\nMarca: " + super.getMarca() + "\nCalibre: " + super.getCalibre() + "\nEstado: " + super.getEstado() + "\nSello del RENAR: " + this.selloRENAR + "\nDescripción: " + this.descripcionUso + "\nNivel: " + this.nivel;
    }
}
