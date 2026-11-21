

public class Benchmark {
    public static Results medir(Runnable accion, String nombre, String sample) {  
        //System.out.println("Funcion" + nombre);
        //1. Tiempo Actual
        long ti = System.nanoTime();
        // 2. Accion
        accion.run();
        //3. Tiempo Final
        long tf = System.nanoTime();
        //4. Retornar


        Results results = new Results(nombre, (tf-ti), sample);

        return results;

        


    }
}
