import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamFilters {

	public static void main(String[] args) {
		
		//create some strings for testing. This could be enhanced to receive strings from args variable
		String [] arrayStrings = {"Josh", "Fred", "Eric"};
		
		//create a new list to hold the strings
		List<String> listStrings = new ArrayList<String>();
		
		//add the array of strings to the list
		listStrings.addAll(Arrays.asList(arrayStrings));
		
		// Get the stream from the list of strings
		Stream<String> streamStrings = listStrings.stream();
		
		// filter the list using the predicate and return any record left.
		Optional<String> optional = streamStrings.filter(p -> "Eric".equals(p)).findAny();
		
		// If a value exists in Optional, print it, otherwise print the default string.
		System.out.println(optional.orElse("Unable to find Eric."));
		
		LambdaExpressions le = new LambdaExpressions();
		System.out.println(le.compareStringsWithLambda("test1", "test2"));

	}

}
