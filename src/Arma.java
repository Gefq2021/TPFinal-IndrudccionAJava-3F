abstract class Arma {
    private int cantMuniciones;
    private double alcance;
    private String marca;
    private int calibre;
    private String estado;

    public Arma(int cantMuniciones, double alcance, String marca, int calibre, String estado) {
        this.cantMuniciones = cantMuniciones;
        this.alcance = alcance;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }

    public int getCantMuniciones() {
        return cantMuniciones;
    }

    public double getAlcance() {
        return alcance;
    }

    public int getCalibre() {
        return calibre;
    }

    public String getMarca() {
        return marca;
    }

    public String getEstado() {
        return estado;
    }

    public boolean enCondicion() {
        return "ES USO".equals(this.estado) && this.calibre >= 9;
    }

    public abstract String getTipoArma();
}
