public class ArmaCorta extends Arma {
    boolean esAutomatica;

    public ArmaCorta(int cantMuniciones, double alcance, String marca, int calibre, String estado, boolean esAutomatica) {
        super(cantMuniciones, alcance, marca, calibre, estado);
        this.esAutomatica = esAutomatica;
    }

    public boolean efectividadMts() {
        return super.getAlcance() > 200;
    }

    @Override
    public String getTipArma() {
        return "Corta";
    }
}
