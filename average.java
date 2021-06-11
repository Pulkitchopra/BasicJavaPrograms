float [] marks = {45.6f, 52.4f, 34.3f, 56.8f, 97.7f };
		float sum=0;
		float avg= 0;
		for (float element: marks ) {
			sum=sum+element;
			avg= sum/marks.length;
		}
		System.out.println("The sum of the numbers is: " +avg);
