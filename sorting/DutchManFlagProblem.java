


public class Main{

    
//Dustchman Flag Problem 

public static void main(String[] args){
    // Before sorting the array

    int[] arr = new int[0,0,1,2,0,1,2,2,1,1,0,1,0]

    for(int i: arr){
        System.out.print(i+ " ");
    }


    sort(arr);
    
    for(int i: arr){
        System.out.print(i+ " ");
    }    


    // After sorting the array 
}


private static void sort(int[] arr){
    int N = arr.length -1 

    start = 0
    end = N-1
    pivot = 1 
    mid = 0

    while(mid <= end){

        if (arr[mid] > pivot){
            swap(arr, mid, end);
            end --;

        }else if (arr[mid] == pivot){

            mid++;

        }else{
            swap(arr, start , mid);
        }

    }
}


private static void swap(int[] arr, source , destination){
    temp = arr[destination];
    arr[destination] = arr[source];
    arr[source] = temp
}
    

}

