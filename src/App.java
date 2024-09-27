public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Métodos de ordenamiento selección");
        Seleccion sel = new Seleccion();
        int[] arreglo = {2, 3, 4, 5, 19, 0};
        sel.selectionSort(arreglo);
        sel.printArreglo(arreglo); // Imprimir el arreglo ordenado
    }
}
