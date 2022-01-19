class BubbleSort{
	

	public static void main(String[] args){

		int[] arr = {1,0,2,19,-4,3,4};

		bubbleSort(arr);

		for(int i: arr){
			System.out.println(i);
		}



	}


	private static void bubbleSort(int[] arr){
		int n = arr.length -1 ;

		for(int i=0;i<=n-1;i++){

			for(int j=0;j<=n-i-1;j++){

				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}

			}

		}

	}


}



/**


i = 0
1,0,-3,9,0 



j = 0 -> j = 4
j = 0 -> j = 3
j = 0 -> j = 2
j = 0 -> j = 1
j = 0 -> j = 0


i = 0 , i-> n-1 
j = 0 , j->n-i

**/
