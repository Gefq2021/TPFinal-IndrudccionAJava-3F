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
        return "Datos del Arma:\n" + " Usuario: " + super.getPolicia() + "\n Cantidad de Municiones: " + super.getCantMuniciones() + "\n Alcance: " + super.getAlcance() + "\n Marca: " + super.getMarca() + "\n Calibre: " + super.getCalibre() + "\n Estado: " + super.getEstado() + "\n Sello del RENAR: " + this.selloRENAR + "\n Descripción: " + this.descripcionUso + "\n Nivel: " + this.nivel;
    }
}
