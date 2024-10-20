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

    @Override
    public String getTipoArma() {
        return "Larga";
    }
}
