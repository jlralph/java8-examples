import java.util.Comparator;

/**
 * 
 */

/**
 * @author Josh Ralph
 *
 */
public class LambdaExpressions {

	private Comparator<String> stringComparator = ((string1, string2) -> { return string1.compareTo(string2); });

	/**
	 * @param stringOne
	 * @param stringTwo
	 * @return 0 if the two strings are equal
	 */
	public int compareStringsWithLambda(String stringOne, String stringTwo) {
		return stringComparator.compare(stringOne, stringTwo);
	}

}
