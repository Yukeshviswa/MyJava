package smartCity;

import java.util.Optional;

public class Optional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="null";
System.out.println(s);
//System.out.println(s.equals("null"));
Optional<String> s1=Optional.ofNullable(null);
Optional<String> s2=Optional.of("Hiii");
System.out.println(s1);
System.out.println(s1.equals("Heyy"));
System.out.println(s2.get());
	System.out.println(s1.isEmpty());
	System.out.println(s2.isPresent());
    s2.ifPresent(w->System.out.println(w+" hello"));
System.out.println(s1.orElse("Java"));
System.out.println(s2.orElse("Java"));
System.out.println(s1.orElseGet(()->"orElseget"));
System.out.println(s2.orElseGet(()->"orElseget"));
System.out.println(s1.of("Java Optional"));
System.out.println(s2.ofNullable("of Nullable"));
System.out.println(s1.toString());
	
	
	
	}
	

}
