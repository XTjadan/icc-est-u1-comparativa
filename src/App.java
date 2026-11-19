import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        /* 
        long nanoTime = System.nanoTime();
        long currenTimeMillis = System.currentTimeMillis();
        System.out.println("Nano time: " + nanoTime);
        System.out.println("Curren Time: " + currenTimeMillis);

        Runnable funcion = () -> {
            System.out.println("Ejecutando Tarea 1 ");
            System.out.println("Ejecutando Tarea 2 ");
        };
        System.out.println("Ejecucion de la funcion Runnable");
        funcion.run();

        
        List<Integer> = new MetodosOrd();
        Metodos m0 = new MetodosOrd();
        m0.burbujs(list);
        Runnable burbujaOrden = () -> m0.burbuja(list):
        ejecutarMasTrde()
        
    
    
      
        
        List<Integer> list = g.generate(1000000);
        System.out.println(list);

        Results benGenList = b.medir(
            () -> g.generate(10000000)," Generacion listado ", " 100 ");

        System.out.println(benGenList);
        */

        // TRABAJO 
        Generador g = new Generador();
        Benchmark b = new Benchmark();
        QuickSort q = new QuickSort();

        Selection s = new Selection();
        
        int[] arr1 = g.generate(1000);
        int[] arr2 = g.generate(50000);
        int[] arr3 = g.generate(100000);


            int[] arr1a = arr1.clone();
            int[] arr1b = arr1.clone();
            int[] arr1c = arr1.clone();
            int[] arr1d = arr1.clone();

            
            int[] arr2a = arr2.clone();
            int[] arr2b = arr2.clone();
            int[] arr2c = arr2.clone();
            int[] arr2d = arr2.clone();

           
            int[] arr3a = arr3.clone();
            int[] arr3b = arr3.clone();
            int[] arr3c = arr3.clone();
            int[] arr3d = arr3.clone();

            //Selection

        Results resultS1 = b.medir(() -> s.sortSelection(arr1a), "Selection", "1000");
        System.out.println(resultS1);
        Results resultS2 = b.medir(() -> s.sortSelection(arr2a), "Selection", "50000");
        System.out.println(resultS2);
        Results resultS3 = b.medir(() -> s.sortSelection(arr3a), "Selection", "100000");
        System.out.println(resultS3);
        
         // QuickSort
         
        Results resultA1 = b.medir(() -> q.quickSort(arr1b), "QuickSort", "1000");
        System.out.println(resultA1);


    



        
        








    }
}
