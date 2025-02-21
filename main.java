import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        tienda tienda = new tienda();

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n--- Green & Click ---");
            System.out.println("1. Buscar por nombre");
            System.out.println("2. Buscar por origen");
            System.out.println("3. Agregar al carrito");
            System.out.println("4. Eliminar del carrito");
            System.out.println("5. Finalizar compra");
            System.out.println("6. Salir");

            String opcion = scan.nextLine();

            if (opcion.equals("1")) {
                System.out.print("Ingrese parte del nombre: ");
                String nombre = scan.nextLine();
                buscar.buscarPorNombre(nombre);
            } else if (opcion.equals("2")) {
                System.out.print("Ingrese el origen: ");
                String origen = scan.nextLine();
                buscar.buscarPorOrigen(origen);
            } else if (opcion.equals("3")) {
                System.out.print("Ingrese el nombre del producto: ");
                String producto = scan.nextLine();
                System.out.print("Ingrese la cantidad: ");
                int cantidad = Integer.parseInt(scan.nextLine());
                tienda.agregarAlCarrito(producto, cantidad);
            } else if (opcion.equals("4")) {
                System.out.print("Ingrese el nombre del producto a eliminar: ");
                String producto = scan.nextLine();
                tienda.eliminarDelCarrito(producto);
            } else if (opcion.equals("5")) {
                tienda.finalizarCompra();
            } else if (opcion.equals("6")) {
                continuar = false;
            } else {
                System.out.println("Opción no válida.");
            }
        }
        scan.close();
    }
}
