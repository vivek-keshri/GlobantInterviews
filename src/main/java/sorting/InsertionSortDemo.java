package sorting;

public class InsertionSortDemo {
    public static void main(String args[]){

        int[] arraytoSort = {60,70,40,20,80,30,90,10,50};
        for(int i=0; i<arraytoSort.length;i++){
            for(int j=i+1; j<arraytoSort.length;j++){
                if(arraytoSort[i] > arraytoSort[j]){
                    arraytoSort[i] = arraytoSort[i] + arraytoSort[j];
                    arraytoSort[j] = arraytoSort[i] - arraytoSort[j];
                    arraytoSort[i] = arraytoSort[i] - arraytoSort[j];
                }

            }
            System.out.println("");
            int iteration = i+1;
            System.out.println("Array after " + iteration + " Iteration :: ");
            for(int entry:arraytoSort) {
                System.out.print("  " + entry);
            }
        }
    }
}
