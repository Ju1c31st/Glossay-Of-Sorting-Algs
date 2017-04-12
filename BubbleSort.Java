	public static void bubbleSort(Fraction[] fractions) {
		for(int i=0; i<fractions.length; i++) {
			for(int k=0; k<fractions.length-1-i; k++) {
				//if an item at index k is more than that at index k+1
				if(fractions[k].compareTo(fractions[k+1]) > 0) {
					//swap them so the new item at index k
					//is NOT more than the item at index k+1
					Fraction temp = fractions[k];
					fractions[k] = fractions[k+1];
					fractions[k+1] = temp;
					/*
					 * note that we are updated references to which items 
					 * of the array refer to! draw a memory diagram of the array
					 * to understand this clearly
					 */
				}
			}
		}
	}
