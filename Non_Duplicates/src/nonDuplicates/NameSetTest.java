package nonDuplicates;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;
import java.util.Scanner;

public class NameSetTest {

	public static void main(String[] args) {
		
		// create and display a List<String>
		String[] fNames = {"Joseph", "Joseph", "Roy", "Emily", "Josh", "Gary", "Eric", "Mia", "Avery", "Avery"};
		List<String> list = Arrays.asList(fNames);
	    System.out.printf("List: %s%n", list);

	    // eliminate duplicates then print the unique values
	    printNonDuplicates(list);
	}
	
	// create a Set from a Collection to eliminate duplicates
	private static void printNonDuplicates(Collection<String> list) {
		// create a HashSet 
	    Set<String> set = new HashSet<>(list);
	    System.out.printf("%nNon-duplicates are: ");

	    for (String value : set) {
	    	System.out.printf("%s ", value);
	    }
	    System.out.println();
	    
	    // get user input
	    Scanner scanner = new Scanner(System.in);
	    System.out.printf("%nEnter a first name:");
	    String input = scanner.nextLine();
	    
	    if(set.contains(input))
	    {
	    	System.out.printf("%nThe first name is exist");
	    }
	    else
	    {
	    	System.out.printf("%nThe first name is not exist");
	    }
	} 
}
