public class FindLargestSmallest{
     public static void main(String [] args){
	     int a [] = new int[] {2,5,58,98, 89,4,-1,73};
		 
		 int smallest = a[0];
		 int largest = a[0];
		 
    for(int i = 1; i < a.length; i++){
	     if(a[i] > largest)
	         largest = a[i];
 		 else if(a[i] < smallest)
 		     smallest = a[i];
	}
	
	System.out.println("Smallest: " + smallest + " "+ "Largest: "+ largest);
	 }
}