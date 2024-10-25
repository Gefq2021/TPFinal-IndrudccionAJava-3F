public class ArmaCorta extends Arma {
    boolean esAutomatica;

    public ArmaCorta(Policia policia ,int cantMuniciones, double alcance, String marca, int calibre, String estado, boolean esAutomatica) {
        super(policia, cantMuniciones, alcance, marca, calibre, estado);
        this.esAutomatica = esAutomatica;
    }

    public boolean isEsAutomatica() {
        return esAutomatica;
    }

    public void setEsAutomatica(boolean esAutomatica) {
        this.esAutomatica = esAutomatica;
    }

    public boolean efectividadMts() {
        return super.getAlcance() > 200;
    }

    @Override
    public String getTipoArma() {
        return "Corta";
    }

    @Override
    public String toString() {
        return "\nDAROS DEL ARMA:" + "\nTipo de Arma: " + getTipoArma() + "\n" + super.getPolicia() + "\nCantidad de Municiones: " + super.getCantMuniciones() + "\nAlcance: " + super.getAlcance() + "\nMarca: " + super.getMarca() + "\nCalibre: " + super.getCalibre() + "\nEstado: " + super.getEstado() + "\nEs Automatica: " + this.esAutomatica;
    }
}
