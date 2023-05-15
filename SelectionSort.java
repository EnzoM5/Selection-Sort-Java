public class SelectionSort {
    float[] CrescenteSelectionSort(float[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[index] > arr[j - 1]) {
                        index = j - 1;//searching for lowest index
                     }
            }
            float menorNumero = arr[index];
            arr[index] = arr[i];
            arr[i] = menorNumero;
        }
        return arr;
    }

    int[] DecrescenteSelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[index] < arr[j - 1]) {
                        index = j - 1;//searching for lowest index
                     }
            }
            int menorNumero = arr[index];
            arr[index] = arr[i];
            arr[i] = menorNumero;
        }
        return arr;

    }
}
