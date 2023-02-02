class Max{
	public static void main(String args[]){
		int[][] array= {{2, 4, 10, }12, 4, {100, 99}, 4}, {3, 2, 99}, 0}};
		int m=array[0][0];
		for(int i=0;i<array.length;i++){
		for(int j=0;j<array[i].length;j++){
			if(array[i][j]>m){
				m=array[i][j];
				}
			}
		}
	System.out.println("Thae maximum number is: "+m);
	}
}