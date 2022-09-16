import java.util.*;
import java.util.stream.Collectors;

// filter demo
class emp {
	int id;
	String name;

	emp(String name) {
		this.name = name;
		this.id = 1;
	}

	@Override
	public String toString() {
		return "emp [id=" + id + ", name=" + name + "]";
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 4, 67, 72, 55, 67, 12 };
		Arrays.stream(arr).map(n -> n % 2 == 0 ? 0 : 1).forEach(System.out::println);
// example 2
		List<String> al = Arrays.asList("Raju", "Ravi", "Ramu");
		List<emp> empList = al.stream().map(emp::new).collect(Collectors.toList());
		empList.forEach(System.out::println);

	}

}
