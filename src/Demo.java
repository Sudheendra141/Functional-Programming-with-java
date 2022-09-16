import java.util.*;
import java.util.stream.Collectors;
// filter demo
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {4,67,72,55,67,12};
		Arrays.stream(arr).map((n)->n%2==0?n:0).collect(Collectors.toList()).forEach(System.out::println);
		
	}

	
	}

}
