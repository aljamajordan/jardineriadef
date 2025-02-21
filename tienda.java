public class tienda {
    static String[] carritoProductos = new String[10];
    static int[] carritoCantidades = new int[10];
    static int carritoSize = 0;

    public static void agregarAlCarrito(String producto, int cantidad) {
        producto = producto.toLowerCase();
        if (carritoSize < 10) {
            for (int i = 0; i < buscar.hierba.length; i++) {
                if (buscar.hierba[i].toLowerCase().equals(producto)) {
                    carritoProductos[carritoSize] = buscar.hierba[i];
                    carritoCantidades[carritoSize] = cantidad;
                    carritoSize++;
                    System.out.println(buscar.hierba[i] + " añadido al carrito.");
                    return;
                }
            }
            System.out.println("Producto no encontrado.");
        } else {
            System.out.println("El carrito esta lleno.");
        }
    }

    public static void eliminarDelCarrito(String producto) {
        producto = producto.toLowerCase();
        for (int i = 0; i < carritoSize; i++) {
            if (carritoProductos[i] != null && carritoProductos[i].toLowerCase().equals(producto)) {
                for (int j = i; j < carritoSize - 1; j++) {
                    carritoProductos[j] = carritoProductos[j + 1];
                    carritoCantidades[j] = carritoCantidades[j + 1];
                }
                carritoSize--;
                System.out.println(producto + " eliminado del carrito.");
                return;
            }
        }
        System.out.println("Producto no encontrado en el carrito.");
    }

    public static void finalizarCompra() {
        int total = 0;
        System.out.println("Resumen de compra:");
        for (int i = 0; i < carritoSize; i++) {
            if (carritoProductos[i] != null) {
                int costo = carritoCantidades[i] * buscar.precio[i];
                System.out.println(carritoProductos[i] + " - Cantidad: " + carritoCantidades[i] + " - Precio: €" + costo);
                total += costo;
            }
        }
        System.out.println("Total a pagar: €" + total);
        carritoSize = 0;
    }
}
