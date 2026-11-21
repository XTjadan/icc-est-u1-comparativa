
public class Generador {

    // Genera un arreglo de tamaño size
    // Con numeros aleatorios de 0 - size
    public static int[] generate(int size) {
        if (size <= 0) {
            return new int[0];
        }
        int[] arreglo = new int[size];
        for (int i = 0; i < size; i++) {
            arreglo[i] = (int) (Math.random() * size);
        }
        return arreglo;
    }
}