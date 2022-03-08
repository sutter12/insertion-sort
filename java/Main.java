//Author: Alexander Sutter
//Date: 3/7/2022

//Insertion Sort

class Main {
    public static void main(String[] args) {
        int[] unsortedList = {5,2,4,6,1,3};

        int[] sortedList = insertionSort(unsortedList);
        
        for(int i=0; i<sortedList.length; i++) {
            System.out.print(sortedList[i] + " ");
        }//end for i loop
    }//end main method

    public static int[] insertionSort(int[] list) {
        for(int j=1; j<list.length; j++) {
            int key = list[j];
            //insert list[i] into the sorted sequence list[1.. j-1]
            int i = j - 1;
            while(i >= 0 && list[i] > key) {
                list[i+1] = list[i];
                i = i - 1;
            }//end while i loop
            list[i+1] = key;
        }//end for j loop

        return list;
    }//end insertionSort(int[])
}//end Main class