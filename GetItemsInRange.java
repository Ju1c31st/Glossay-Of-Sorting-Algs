public static int[] getItemsInRange(int[] arr, int low, int high) {
  if(arr == null)
		  	return null;
	  	int count = 0;
		  for(int i=0; i < arr.length; i++) {
		  	if(arr[i] >= low && arr[i] <= high) {
		  		count++;
		  	}
		  }
		
	  	int[] result = new int[count];
	  	int idx = 0;
	  	for(int i=0; i < arr.length; i++) {
	  		if(arr[i] >= low && arr[i] <= high) {
		  		result[idx] = arr[i];
		  		idx++;
			  }
		  } 
		  return result;
  }
}
