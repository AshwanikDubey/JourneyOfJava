package collection;

import java.util.Arrays;

public class ComparatorAndComparable {

	public static void main(String[] args) {
		// Comparator and Comparable both provides a way or help to sort the collection of Objects.
		
		int array[] = {1,2,3,4};
		Arrays.sort(array);// its sorted in ascending order because internally use DualPivotQuicksort
		//While using sort method how to sort in descending order?
		//how to sort object collection?
		car [] carArray = new car[3];
		carArray[0]=car.getBuild().setCarName("SUV").setCarType("petrol").build();
		carArray[1] = car.getBuild().setCarName("Sedan").setCarType("diesel").build();
		carArray[2] = car.getBuild().setCarName("HatchBack").setCarType("CNG").build();
		
		//Arrays.sort(carArray);// throw java.lang.ClassCastException {car cannot be cast to class java.lang.Comparable}
		
		
	}
	 

}


