import java.util.ArrayList;
import java.util.Scanner;

/*
   Given an array, rotate the array to the right by k steps, 
   where k is non-negative (integer). 
   Example :
	Input: numbers = [1,2,3,4,5,6,7], k = 3
	Output: [5,6,7,1,2,3,4]
	Explanation:
	rotate 1 steps to the right: [7,1,2,3,4,5,6]
	rotate 2 steps to the right: [6,7,1,2,3,4,5]
	rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		finalBox(in);	
	}
	public static void finalBox(Scanner in) {
		
		ArrayList<Integer> narl = new ArrayList<>();
		ArrayList<Integer> arl = new ArrayList<>();
		
		Integer [] inAr = sizeNelements(in);
		for(Integer element : inAr)
			arl.add(element);
		System.out.println(arl);
		
		System.out.println("Enter number of steps to rotate the array to the right: ");
		int kSteps = 0;
		while (true) {
			kSteps = in.nextInt();
			if(kSteps<=arl.size())
				break;
			else
				System.out.println("The number "+kSteps+"  exceeds arrays length!\n"
						+ "Please try a different number '<' or '=' to the arrays length");
		}
		
		for(int i = 1; i <= kSteps; ++i )
		{	 
			arl.add(0, inAr[inAr.length-i]);	
		}
		for(int i=0; i<arl.size()-kSteps; ++i)
		{
			narl.add(i, arl.get(i));
		}

			System.out.println(narl);
			arl.removeAll(arl);
			
	}

	public static Integer[] sizeNelements(Scanner in) {
		
		System.out.println("Enter size of the array: ");
		int sizeOfAr = in.nextInt();
		Integer[] inAr = new Integer[sizeOfAr];
		System.out.println("Enter elements in the array: ");
		for(int i=0; i<inAr.length; ++i)
		{
			inAr[i] = in.nextInt();
		}
	return inAr;
}
	
}
