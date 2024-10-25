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
        return "Datos del Arma:\n" + " Usuario: " + super.getPolicia() + "\n Cantidad de Municiones: " + super.getCantMuniciones() + "\n Alcance: " + super.getAlcance() + "\n Marca: " + super.getMarca() + "\n Calibre: " + super.getCalibre() + "\n Estado: " + super.getEstado() + "\n Es Automatica: " + this.esAutomatica;
    }
}
