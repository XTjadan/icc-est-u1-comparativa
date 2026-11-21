import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * long nanoTime = System.nanoTime();
         * long currenTimeMillis = System.currentTimeMillis();
         * System.out.println("Nano time: " + nanoTime);
         * System.out.println("Curren Time: " + currenTimeMillis);
         * 
         * Runnable funcion = () -> {
         * System.out.println("Ejecutando Tarea 1 ");
         * System.out.println("Ejecutando Tarea 2 ");
         * };
         * System.out.println("Ejecucion de la funcion Runnable");
         * funcion.run();
         * 
         * 
         * List<Integer> = new MetodosOrd();
         * Metodos m0 = new MetodosOrd();
         * m0.burbujs(list);
         * Runnable burbujaOrden = () -> m0.burbuja(list):
         * ejecutarMasTrde()
         * 
         * List<Integer> list = g.generate(1000000);
         * System.out.println(list);
         * 
         * Results benGenList = b.medir(
         * () -> g.generate(10000000)," Generacion listado ", " 100 ");
         * 
         * System.out.println(benGenList);
         */

        // TRABAJO

        ArrayList<Results> results = new ArrayList<>();
        Generador g = new Generador();
        Benchmark b = new Benchmark();
        QuickSort q = new QuickSort();
        Selection s = new Selection();

        int[] arr1 = g.generate(10000);
        int[] arr2 = g.generate(50000);
        int[] arr3 = g.generate(100000);

        int[] arr1a = arr1.clone();
        int[] arr1b = arr1.clone();
        int[] arr1c = arr1.clone();
        Integer[] arr1d = new Integer[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1d[i] = arr1[i];
        }

        int[] arr2a = arr2.clone();
        int[] arr2b = arr2.clone();
        int[] arr2c = arr2.clone();
        Integer[] arr2d = new Integer[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2d[i] = arr2[i];
        }

        int[] arr3a = arr3.clone();
        int[] arr3b = arr3.clone();
        int[] arr3c = arr3.clone();
        Integer[] arr3d = new Integer[arr3.length];
        for (int i = 0; i < arr3.length; i++) {
            arr3d[i] = arr3[i];
        }

        System.out.println("---RESULTADOS---");

        // Selection

        Results resultS1 = b.medir(() -> s.sortSelection(arr1a), "Selection", "10000");
        Results resultS2 = b.medir(() -> s.sortSelection(arr2a), "Selection", "50000");
        Results resultS3 = b.medir(() -> s.sortSelection(arr3a), "Selection", "100000");
        results.add(resultS1);
        results.add(resultS2);
        results.add(resultS3);

        // QuickSort

        Results resultA1 = b.medir(() -> q.sortQuick(arr1b), "QuickSort", "10000");
        Results resultA2 = b.medir(() -> q.sortQuick(arr2b), "QuickSort", "50000");
        Results resultA3 = b.medir(() -> q.sortQuick(arr3b), "QuickSort", "100000");
        results.add(resultA1);
        results.add(resultA2);  
        results.add(resultA3);

        // Array list

        Results resultB1 = b.medir(() -> Arrays.sort(arr1c), "Array", "10000");
        Results resultB2 = b.medir(() -> Arrays.sort(arr2c), "Array", "50000");
        Results resultB3 = b.medir(() -> Arrays.sort(arr3c), "Array", "100000");
        results.add(resultB1);
        results.add(resultB2);
        results.add(resultB3);

        // ARRAY LSIT CON COMPARATOR

        Comparator<Integer> comparator = (e1, e2) -> Integer.compare(e1, e2);
        Results resultC1 = b.medir(() -> Arrays.sort(arr1d, comparator), "Array Comparator", "10000");
        Results resultC2 = b.medir(() -> Arrays.sort(arr2d, comparator), "Array Comparator", "50000");
        Results resultC3 = b.medir(() -> Arrays.sort(arr3d, comparator), "Array Comparator", "100000");
        results.add(resultC1);
        results.add(resultC2);
        results.add(resultC3);

        
        System.out.println(
                "----------------------------------------------------------------------------------------------------------------------------------");

        for (Results r : results) {
            System.out.println(r);
        }

    }
}
