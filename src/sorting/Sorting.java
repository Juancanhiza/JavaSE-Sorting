package sorting;

/** This is a practice of Sorting algorithms
 *
 * @author Juanca
 */
public class Sorting {

    public static void main(String[] args) {
        int v[]={68,23,21,2};
        Sorting sorting = new Sorting();
        sorting.printVector(v);
        sorting.selectionSort(v);
        sorting.printVector(v);
    }
    
    public void selectionSort(int vector[]){
        int len = vector.length;
        for (int i=0; i<len-1; i++){
            int minor = vector[i];
            int index_minor=i;
            for (int j=i+1; j<len; j++){
                if (vector[j]<minor){
                    minor = vector[j];
                    index_minor=j;
                }
            }
            swap(vector, i, index_minor);
        }
    }
    
     void printVector(int vector[]){
        for (int i=0; i<vector.length; i++){
            System.out.print(vector[i]+ " ");
        }
        System.out.println("");
    }
    
    public void swap(int vector[], int i, int j){
        int aux = vector[i];
        vector[i] = vector[j];
        vector[j] = aux;
    }
}
