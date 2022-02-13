package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaStreamsTest {
//Count The Number Of Alphabets Starting With A
	@Test
	public void countTheNunmerOfAlphabets() {
		//Count the number of alphabets
		ArrayList<String> nameList = new ArrayList<>();
		nameList.add("Antony");
		nameList.add("Baasha");
		nameList.add("Arul");
		nameList.add("Arun");
		nameList.add("Cindrella");

		//Count the number of alphabets that starts  with "A" 
		int count = 0;
		for (int i = 0; i < nameList.size(); i++) {
			String names = nameList.get(i);
			if (names.startsWith("A")) {
				count++;
			}
		}
		System.out.println("The number of alphabets starts with 'A': " + count);
	}

	@Test
	public void streamFilterCountTheNumberOfAlphabets() {
		//Count the number of alphabets that starts  with "A"  using Stream optimized code

		ArrayList<String> names_List = new ArrayList<>();
		names_List.add("Abhijeet");
		names_List.add("Don");
		names_List.add("Alekhya");
		names_List.add("Adam");
		names_List.add("Ram");

		Long $stream_FilterCountTheNumberOfAlphabets = names_List.stream().filter(a -> a.startsWith("A")).count();
//		Long $stream_FilterCountTheNumberOfAlphabets = names_List.stream().count();

		System.out.println("The number of alphabets starts with 'A': " + $stream_FilterCountTheNumberOfAlphabets);

		/*
		 * Long stream_Filter_Count_The_Number_Of_Alphabets = Stream.of("Abhijeet",
		 * "Don", "Alekhya", "Adam", "Ram").filter(s -> { s.startsWith("A"); return
		 * true; }).count();
		 * System.out.println("The number of alphabets starts with 'A': " +
		 * stream_Filter_Count_The_Number_Of_Alphabets);
		 */
		
		//Print the name of that is larger than 4 letters using Stream optimized code
         names_List.stream().filter(s -> s.length() > 4)
				.forEach(s -> System.out.println("Print the name that is larger than 4 letters: " + s));
 		
         //Print the name of that is larger than 4 letters and limit the results using Stream optimized code
         names_List.stream().filter(e -> e.length() > 4).limit(1).forEach(
				e -> System.out.println("Limit the name that print the name that is larger than 4 letters: " + e));
	}

	@Test
	public void streamMap() {
		// Print names that ends with last letter a and change it to uppercase
		Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Rama").filter(n -> n.endsWith("a")).map(n -> n.toUpperCase())
				.forEach(n -> System.out.println(
						"Print the names of the last character that ends with a and change them to uppercase: " + n));

		// Print names in a sorted that ends with last letter a and change it to
		// uppercase
		List<String> names = Arrays.asList("Azbhijeet", "Don", "Alekhya", "Adam", "Rama");
		names.stream().filter(m -> m.startsWith("A")).sorted().map(m -> m.toUpperCase()).forEach(m -> System.out.println(
				"Print the names of the last character in sorted order that ends with a and change them to uppercase: "
						+ m));

		//Count the number of alphabets that starts  with "A"  using Stream optimized code
		List<String> namesList = Arrays.asList("Azbhijeet", "Don", "Alekhya", "Adam", "Rama");
		Long $names =namesList.stream().filter(d->d.startsWith("A")).count();
		System.out.println($names);
		
		//Merge Two Lists
        ArrayList<String> nameList1 = new ArrayList<>();
		nameList1.add("Antony");
		nameList1.add("Baasha");
		nameList1.add("Arul");
		List<String> namesList2 = Arrays.asList("Azbhijeet", "Don", "Alekhya", "Adam", "Rama");
		Stream<String> newStream = Stream.concat(nameList1.stream(), namesList2.stream());
		newStream.sorted().forEach(k->System.out.println(k));
		
		//Find match using anyMatch and equalsIgnoreCase in Stream and test the match using Assert 
		List<String> narenBucketList1 = Arrays.asList("Naren","Ahila","Bagavathy","Srimathy");
		List<String> narenBucketList2 = Arrays.asList("Vijay","Mukitha","Naethra","Shrawan");
		Stream<String> newStream1 = Stream.concat(narenBucketList1.stream(), narenBucketList2.stream());
        boolean flag = newStream1.anyMatch(d->d.equalsIgnoreCase("Naren"));
        System.out.println(flag);
        Assert.assertTrue(flag);
  }
	
	@Test
	public void streamCollect() {
		//Getting the name from the array using collectors.
		//collect() method is used to collect results and convert it back to any list.
		List<String> coolNames = Stream.of("Azbhijeet", "Don", "Alekhya", "Adam", "Rama").filter(h->h.endsWith("a")).map(h->h.toUpperCase()).collect(Collectors.toList());
        System.out.println(coolNames.get(1));
        
        //print the unique number from the array
        List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
        values.stream().distinct().forEach(d->System.out.println("Print the unique number from the array: " + d));
        
        //sort the array and print the 3rd value from the array. 
        List<Integer> values1 = Arrays.asList(3,2,2,7,5,1,9,7);
        List<Integer> sortedIntegers=values1.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(sortedIntegers.get(2));
        
	}
}
