package smartCity;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Strm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> al=new ArrayList<>();
al.add(40);
al.add(20);
al.add(10);
al.add(5);
al.add(40);
//al.stream().forEach(f->System.out.println(f));
//al.stream().filter(q->q>10).forEach(w->System.out.println(w));
List l=al.stream().sorted().collect(Collectors.toList());
al.stream().sorted().limit(3).skip(2).forEach(y->System.out.println(y));
 System.out.println(al.stream().findAny());

	}

}
