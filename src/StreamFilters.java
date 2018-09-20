import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilters {

	public static void main(String[] args) {
		String [] arrayStrings = {"Tom", "Fred", "Eric"};
		List<String> listStrings = new ArrayList<String>();
		listStrings.addAll(Arrays.asList(arrayStrings));
		
		Stream<String> steamStrings = listStrings.stream();

	}

}
