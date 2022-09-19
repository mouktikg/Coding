package com.mouktik;


import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = Arrays.asList(1,10,2,11,3,12,4,13,5,6,6,5);
		Set<Integer> intSet = new HashSet<Integer>();
		
		Stream<Integer> intStream = Stream.iterate(1, n ->n+1 ).limit(10);
		//intStream.forEach(n -> System.out.println(n));
		// Stream.generate(()-> "Sohini").limit(10).forEach(n-> System.out.println(n));
		// intList.stream().limit(4).forEach(n-> System.out.println(n));
		//System.out.println(intList.stream().mapToInt(n->n).average().getAsDouble());
		//System.out.println(intList.stream().collect(Collectors.averagingDouble(Integer::intValue)));
		//System.out.println(intList.stream().collect(Collectors.averagingDouble(e->e)));
//intList.stream().map(Function.identity());

		//intList.stream().filter(n->!intSet.add(n)).collect(Collectors.toSet()).forEach(n->System.out.println(n));
		 Map<Integer, Long> collect = intList.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
System.out.println(collect);

collect.entrySet().forEach(n-> {
	if(n.getValue()>1) {
		System.out.println(n.getKey());
	}
	
});
//System.out.println(collect.values().stream().filter(n->n.size()>1).flatMap(n->n.stream()).collect(Collectors.toSet()));

//System.out.println(Stream.of("Kolkata","Chennai","Mumbai","Kolkata").collect(Collectors.groupingBy(e->e,Collectors.counting())));
//System.out.println(intList.stream().mapToInt(n->n).sum());
//System.out.println(intList.stream().reduce((a,b)->a+b).get());

//System.out.println(intList.stream().reduce((a,b)->a*b).get());

//System.out.println(intList.parallelStream().reduce((a,b)->a*b).get());
// System.out.println(intList.stream().collect(Collectors.summingInt(e->e)));
//intList.stream().sorted().forEach(n-> System.out.println(n));
//intList.stream().sorted((i1,i2)->i2.compareTo(i1)).forEach(n->System.out.println(n));
//System.out.println(intList.stream().max((i1,i2)->i1.compareTo(i2)).get());
//Stream<Integer> sorted = intList.stream().sorted(Comparator.comparing(e->e));

String name ="aaajjjkkdkkfjjdd";

char[] charArray = name.toCharArray();
//System.out.println(charArray);

//Map<char[], List<char[]>> collect = Stream.of(name.toCharArray()).collect(Collectors.groupingBy(n->n));

//System.out.println(collect);
//name.chars().forEach(n->System.out.println(n));
 //name.chars().collect(Collectors.groupingBy(n->n,Collectors.counting()));

	}

}