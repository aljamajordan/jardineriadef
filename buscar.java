public class buscar {
    static String[] hierba = {"Maria Juana", "Hierba de los bosques", "La seta feliz", "El oro verde"};
    static String[] origen = {"Mexico", "Andorra", "Marrueco", "Palestina"};
    static int[] precio = {2, 4, 3, 1};

    public static void buscarPorNombre(String nombre) {
        nombre = nombre.toLowerCase();
        for (int i = 0; i < hierba.length; i++) {
            if (hierba[i].toLowerCase().contains(nombre)) {
                System.out.println(hierba[i] + " - " + origen[i] + " - €" + precio[i]);
            }
        }
    }

    public static void buscarPorOrigen(String lugar) {
        lugar = lugar.toLowerCase();
        for (int i = 0; i < origen.length; i++) {
            if (origen[i].toLowerCase().equals(lugar)) {
                System.out.println(hierba[i] + " - " + origen[i] + " - €" + precio[i]);
            }
        }
    }
}
