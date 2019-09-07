public class MySum {	//Class Name is MySum
	
	static int sumofnumbers (int numbers) {		//Method defined is sumofnumbers
		int output = 0;
		for(int i=1;i<=numbers;i++) {		//for loop
			output += i;
		}
		return output;		//Return Output
	}
	
	public static void main(String[] args) {	//Main function
		
		int numbers = Integer.parseInt(args[0]);
		System.out.println(sumofnumbers(numbers));		
	}
}
