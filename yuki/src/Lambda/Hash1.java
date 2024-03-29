package Lambda;
import java.util.HashMap;
public class Hash1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//HashMap<Integer,String> mm=new HashMap<>();  //HomoGenious
HashMap<Object, Object> mm=new HashMap<>();           //HetroGenious
mm.put(001,"Ram");
mm.put(002,"Yuki");
mm.put(003,"Akash");
mm.put(004,"EpKO");
System.out.println(mm);
System.out.println(mm.get(001));
System.out.println(mm.replace(004,"Raja"));
	}

}
