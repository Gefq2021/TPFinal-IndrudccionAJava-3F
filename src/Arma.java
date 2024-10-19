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

    public abstract boolean enCondicion();
}
