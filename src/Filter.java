import java.util.*;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> al = Arrays.asList(1, 2, 4, 5, 6, 7, 123);
		List<String> name = Arrays.asList("AmmA", "Kanna", "Book", "vikaakiv");

		List<String> Palindroms = name.stream().filter(a -> Filter.isPalindrome(a)).collect(Collectors.toList());

		Palindroms.forEach(System.out::println);
		al.stream().filter((a) -> {
			return a % 2 == 0;
		}).forEach(System.out::println);
	}

	static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

}
