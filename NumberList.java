// removed unnecessary import after removing reference to the Math function Max()

public class NumberList {
	// removed unnecessary variables count and sum
	// corrected initialization values (MAX_VALUE for smallest and MIN_VALUE for largest)
	private int smallest = Integer.MAX_VALUE;
	private int largest = Integer.MIN_VALUE;

	// removed unuseful method Data()
	
	// removed unnecessary constructor (relying on the default constructor because no additional initializations are needed for the variables smallest and largest)

	// changed the name of the method newValue() to addValue() to match the reference used in NumberListTester.java
	public void addValue(int x){
		// removed irrelevant lines of code related to count and sum
		// changed from if-else statement to two if statements so that adding the first value will set both largest and smallest to this value
		if (x > largest)
			largest = x;
		if (x < smallest)
			smallest = x;
	}
	
	public int getLargest(){
		return largest;
	}

	public int getSmallest(){
		return smallest;
	}
}