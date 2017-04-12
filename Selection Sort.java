public static void selectionSort(int[] arr) {
		if(arr == null)
		       return;
		    
		  for(int i=0; i < arr.length - 1; i++) { 
		    int minIndex = i; 
		    for(int k = i + 1; k < arr.length; k++) { 
		      if (arr[k] < arr[minIndex]) { 
				    minIndex = k; 
		      }
		    }

		    int temp = arr[i]; 
		    arr[i] = arr[minIndex]; 
		    arr[minIndex] = temp; 		  
		}
	}

public static void selectionSort(int[] arr){
		int index, minValue, minIndex, start;

		if(arr == null){
			return;
		}

		for( start=0; start<arr.length-1; start++ ){
			minIndex = start;
			minValue = arr[start];

			for(index = start+1; index<arr.length; index++){
				if(arr[index] < minValue){
					minValue = arr[index];
					minIndex = index;
				}
			}
			arr[minIndex] = arr[start];
			arr[start] = minValue;
		}
	}
