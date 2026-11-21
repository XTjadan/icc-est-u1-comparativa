
public class QuickSort {
    public void sortQuick(int[] a){
        if(a == null || a.length <= 1){
            return ;
        }
        sortQuick(a, 0, a.length - 1);
    }

    public void sortQuick(int a[], int izq, int der) {
        int pivot = a[izq];
        int i = izq;
        int j = der;
        int aux;

        while (i < j) {
            while (a[i] <= pivot && i < j) {
                i++;
            }

            while (a[j] > pivot) {
                j--;
            }

            if (i < j) {
                aux = a[j];
                a[j] = a[i];
                a[i] = aux;
            }
            }

            a[izq] = a[j];
            a[j] = pivot;
            if (izq < j - 1) {
                sortQuick(a, izq, j - 1);
            }

            if (j + 1 < der) {
                sortQuick(a, j + 1, der);
            }
        
    }

}
