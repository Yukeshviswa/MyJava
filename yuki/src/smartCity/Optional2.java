package smartCity;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Optional2 {

	public static <chat> void main(String[] args) {
		// TODO Auto-generated method stub
String input="programming";
chat firstNonrepeatedchar=input.chars()
.mapToObj(c->(char)c)
.collect((Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream()
		.filter(entry -> entry.getValue()==1)
		.map(Map.Entry::getKey).findFirst().orElseThrow(() -> new RuntimeException("NO non-repeated character found"));
System.out.println("First non-repeated Character found:"+ firstNonRepeatedchat);

		
		
		
		
		
		
		
		
	}

}
