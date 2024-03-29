package smartCity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class abcd{
		String name;
		
		abcd(String name){
			this.name=name;
		}
		public String toString() {
			return name;
		}
	}
	
		
	
		public class Coma {	
		public static void main(String []args) {
			ArrayList cab = new ArrayList();
			cab.add(new abcd("Data"));
			cab.add(new abcd("Server"));
			cab.add(new abcd("Network"));
			cab.add(new abcd("Wifi"));

			Comparator<abcd> bb = (o1, o2)->{
				abcd v = (abcd)o1;
				abcd v2 = (abcd)o2;
				if(v.name.length()>v2.name.length()) {
				return 1;}
				else if(v.name.length()<v2.name.length()){
				return -1;}
				return 0;};
			Collections.sort(cab,  bb);
			System.out.println(cab);	
		}
		}
