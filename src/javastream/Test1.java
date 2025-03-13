package javastream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Test1 {
	
	//Count the number of names starting with alphabet A in list
	@Test
	public void regular() {
		
		List<String> name=new ArrayList<String>();
		name.add("Ammu");
		name.add("Appu");
		name.add("Abhi");
		name.add("Ajay");
		name.add("Rahul");
		name.add("Kithu");
		name.add("Gopu");
		int count=0;
		for(int i=0;i<name.size();i++) {
			
			String actual=name.get(i);
			
			if(actual.startsWith("A")) {
				
				count++;
			}
		}
		System.out.println(count);
	}
	 @Test
	 public void streamfilter() {
		 
		 List<String> name=new ArrayList<String>();
			name.add("Ammu");
			name.add("Appu");
			name.add("Abhi");
			name.add("Ajay");
			name.add("Rahul");
			name.add("Kithu");
			name.add("Gopu");
			Long c=name.stream().filter(s->s.startsWith("A")).count();
			System.out.println(c);
	 }

	 @Test
	 public void streamfilter1() {
		  Long c=Stream.of("Ammu","Appu","Gopu","Abhi","Rahul","Kithu","Ajay").filter(s->s.startsWith("A")).count();
		  System.out.println(c);
	 }


@Test 
public void stramfilter2() {
	//print all the names in a array whose length is greater than 4
	 List<String> name=new ArrayList<String>();
		name.add("Ammu");
		name.add("Appu");
		name.add("Abhi");
		name.add("Ajay");
		name.add("Rahul");
		name.add("Kithu");
		name.add("Gopu");
		
		name.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		name.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
}
@Test
public void streamFilter3() {
	//print names end with u in uppercase
	Stream.of("Ammu","Appu","Gopu","Abhi","Rahul","Kithu","Ajay").filter(s->s.endsWith("u")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
}
@Test
public void streamfilter4() {
	//print names starting with "A" in upper case also in  sorted order
	Stream.of("Ammu","Appu","Gopu","Abhi","Rahul","Kithu","Ajay").filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
}
@Test
public void streamfilter5() {
	//Merging 2 different stream and sort them
	List<String> name=Arrays.asList("Ammu","Appu","Gopu","Abhi","Rahul","Kithu","Ajay");
	List<String> name2=Arrays.asList("Jaya","Vijay","Ram","Sitha");
	Stream<String> name3= Stream.concat(name.stream(), name2.stream());
	//name3.sorted().forEach(s->System.out.println(s));
	
	boolean flag= name3.anyMatch(s->s.equalsIgnoreCase("appu"));
	System.out.println(flag);
	Assert.assertTrue(flag);
}
@Test
public void streamfilter6() {
	List<String> ls=Stream.of("Ammu","Appu","Gopu","Abhi","Rahul","Kithu","Ajay").filter(s->s.endsWith("u")).collect(Collectors.toList());
	System.out.println(ls.get(0));
}
@Test
public void streamnumber() {
	Stream.of(1,44,22,14,66,81,12,1,3,5,2,1,2,3,6,4,6,4,5,78,78).distinct().sorted().forEach(s->System.out.println(s));
}
}