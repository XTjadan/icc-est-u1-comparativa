public class Selection {

    public void sortSelection(int[] arreglo) {
        int cambios = 0;
        int combinaciones = 0;

        for (int i = 0; i < arreglo.length; i++) {
            int min = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                combinaciones++;
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int valOriginal = arreglo[i];
                int valNuevo = arreglo[min];

                int temp = arreglo[min];
                arreglo[min] = arreglo[i];
                arreglo[i] = temp;
                cambios++;
               
                
                
            }           
        }
        ;
        
    
    }
}
