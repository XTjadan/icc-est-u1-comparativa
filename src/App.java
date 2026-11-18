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
        
        */


        Generador g = new Generador();
        Benchmark b = new Benchmark();

        List<Integer> list = g.generate(1000000);
        System.out.println(list);

        Results benGenList = b.medir(
            () -> g.generate(10000000)," Generacion listado ", " 100 ");

        System.out.println(benGenList);






    }
}
