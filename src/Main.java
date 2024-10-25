public class Main {
    public static void main(String[] args) {
        // Creamos dos objetos policías
        Policia policia1 = new Policia("Pablo", "Ortega", 12345);
        Policia policia2 = new Policia("Claudia", "Rojas", 67890);

        // Creamos dos armas cortas
        ArmaCorta armaCorta1 = new ArmaCorta(policia1, 15, 250, "Glock", 9, "NUEVA", true);
        ArmaCorta armaCorta2 = new ArmaCorta(policia2, 10, 150, "Beretta", 8, "EN USO", false);

        // Creamos dos armas largas
        ArmaLarga armaLarga1 = new ArmaLarga(policia1, 5, 800, "Remington", 12, "EN USO", true, "Para uso en francotirador", 4);
        ArmaLarga armaLarga2 = new ArmaLarga(policia2, 8, 40, "Mossberg 500", 12, "EN MANTENIMIENTO", true, "Uso en patrullaje", 3);


        // Verificamos condiciones de uso
        System.out.println("El Arma Corta 1 esta en condiciones de uso: " + armaCorta1.enCondicion());
        System.out.println("El Arma Corta 2 esta en condiciones de uso: " + armaCorta2.enCondicion());
        System.out.println("El Arma Larga 1 esta en condiciones de uso: " + armaLarga1.enCondicion());
        System.out.println("El Arma Larga 2 esta en condiciones de uso: " + armaLarga2.enCondicion());

        // Verificar si se puede disparar a más de 200m
        System.out.println("El Arma corta 1 puede disparar a más de 200m: " + armaCorta1.efectividadMts());
        System.out.println("El Arma corta 2 puede disparar a más de 200m: " + armaCorta2.efectividadMts());

        // Comparamos las armas largas
        int comparacion = armaLarga1.compareTo(armaLarga2);
        if (comparacion > 0) {
            System.out.println("El Arma larga 1 es de mayor nivel que la arma larga 2.");
        } else if (comparacion < 0) {
            System.out.println("El Arma larga 2 es de mayor nivel que la arma larga 1.");
        } else {
            System.out.println("Ambas armas largas tienen el mismo nivel.");
        }

        // Mostramos los datos de los policias:
        System.out.println(policia1.toString());
        System.out.println(policia2.toString());

        // Mostramos los datos de las Armas Cortas:
        System.out.println(armaCorta1.toString());
        System.out.println(armaCorta2.toString());

        // Mostramos los datos de las Armas Largas:
        System.out.println(armaLarga1.toString());
        System.out.println(armaLarga2.toString());

    }
}
