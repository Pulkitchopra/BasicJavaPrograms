		int [][] a = {{ 2, 5, 8},
				     { 4, 7, 10},
		             { 3, 5, 15}};
		int [][] b = {{ 1, 6, 9},
				      {10, 12, 15},
				      { 5, 6, 19}};
		
		int [][] addition = {{0, 0, 0},
				             {0, 0, 0},
				             {0, 0, 0}};
		
		for (int i=0; i<a.length; i++) {
			for (int j=0;j<a[i].length;j++) {
				
				addition[i][j] = a[i][j] + b[i][j];
				System.out.print(" "+ addition[i][j]);
			}
				System.out.println("");
		}
		
