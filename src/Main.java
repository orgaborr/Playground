/**
 * 
 */

/**
 * @author Gábor
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		int[][] array2D = {{1,2,3},
//							{4,5,6},
//							{7,8,9}};
//		
//		//System.out.println(array2D[2][2]);
//		
//		for(int i=0; i<array2D.length; i++) {
//			for(int j=0; j<array2D.length; j++) {
//				System.out.println(array2D[i][j]);
//			}
//		}
		
//		String[][] ar = {{"dog", "cat", "chicken"},
//						{"tree", "flower", "bush"},
//						{"ball", "pen", "rocket"}};
//		
//		for(int i=0; i<ar.length; i++) {
//			for(int j=0; j<ar.length; j++) {
//				System.out.println(ar[i][j]);
//			}
//		}
		
//		int a = 5;
//		int b = 7;
//		System.out.println(swap(a,b)[0] + ", " + swap(a,b)[1]);
//		
//		for(int i=0; i<10; i++) {
//			System.out.println(i);
//		}
		
//	    byte value = -128;
//	    System.out.println(value);
		
//	    int a=3;
//	    a=a++;
//	    System.out.println("Post-Increment a: " +a);
//	    System.out.println("a: "+a );
//	 
//	    a=++a;
//	    System.out.println("Pre-Increment a: "+a );
//	 
//	    a=a--;
//	    System.out.println("Post-Decrement a: " +a);
//	 
//	    a=--a;
//	    System.out.println("Pre-Decrement a: "+a );
//	    
//	    System.out.println("a: "+a );
	    
//	    float x =4;
//        x*=5;
//        x-=6;
//        x+=1;
//        x/=2;
//
//      System.out.println(x);
		
//		int value = 1234;
//		int sumOfDigits = 0;
//		
//		while(true) {
//			if(value < 1) {
//				break;
//			}
//			sumOfDigits += value % 10;
//			value /= 10;
//			System.out.println("value is: " + value + ", sum is: " + sumOfDigits);
//				
//		}
//		System.out.println(sumOfDigits);
		
//		int[] ar = new int[2];
//		try {
//			System.out.println("3rd element of ar is " + ar[2]);
//		} catch(ArrayIndexOutOfBoundsException e1) {
//			System.out.println(e1.toString());
//		} catch(Exception e2) {
//			System.out.println(e2.toString());
//		} finally {
//			System.out.println("oh well.");
//		}	
		
		System.out.println(average(5,6,89,12,3));
	    
	}

	public static int[] swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		int[] swappedArray = {a, b};
		return swappedArray;
	}
	
	//we can enter as many ins as we want
	public static int average(int...numbers) {
		int total = 0;
		for(int x : numbers) {
			total += x;
		}
		return total/numbers.length;
	}
}


