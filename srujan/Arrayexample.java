package srujan;

public class Arrayexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare array
		int arr[];
		
		//defining an array
		//there are six array elements
		//starting index Zero end index is 6-1=5
		arr = new int[6];
		
		//initializing an array ...means giving value to array elements
		for(int i= 0; i < arr.length; i++) {
			arr[i] = i * 3;
			
		}
		
		//printing the values
		for (int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
