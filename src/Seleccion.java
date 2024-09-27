public class Seleccion {
    public int[] selectionSort(int[] arreglo) {
        int tamanio = arreglo.length;

        // Recorrer el arreglo
        for (int i = 0; i < tamanio; i++) {
            int indice = i;
            for (int j = i + 1; j < tamanio; j++) {
                if (arreglo[j] < arreglo[indice]) { // Cambiar a menor para orden ascendente
                    indice = j;
                }
            }
            // Intercambio del índice encontrado por el primero
            int aux = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] = aux;
        }
        return arreglo;
    }

    public void printArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println(); // Nueva línea después de imprimir el arreglo
    }
}