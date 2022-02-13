package javacollection;

import java.util.EnumMap;

public class EnumMapDemo {
	enum Day {
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
	}

	public static void main(String[] args) {
		EnumMap<Day, Integer> enumMapDays = new EnumMap<>(Day.class);
		enumMapDays.put(Day.Monday, 1);
		enumMapDays.put(Day.Tuesday, 2);
		enumMapDays.put(Day.Wednesday, 3);
		enumMapDays.put(Day.Thursday, 4);
		enumMapDays.put(Day.Friday, 5);
		enumMapDays.put(Day.Saturday, 6);
		enumMapDays.put(Day.Sunday, 7);
		System.out.println(enumMapDays);
	}
}


//EnumMap is a specialized implementation of the Map interface for enumeration types. It extends AbstractMap and implements the Map interface in Java. 
//It belongs to the java.util package. Few important features of EnumMap are as follows: 
//
//EnumMap class is a member of the Java Collections Framework & is not synchronized.
//It’s a high-performance map implementation, much faster than HashMap.
//All keys of each EnumMap instance must be keys of a single enum type.
//EnumMap is internally represented as arrays. This representation is extremely compact and efficient.