package sample1;
import java.util.*;
interface Double{
	public void draw();
}
public class Sample7 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//Vector<String> list=new Vector<String>();
//list.add("yuki");
//list.add("ram");
//list.add("viki");
//list.add("mano");
//Iterator itr=list.iterator();
//while(itr.hasNext()) {
//	System.out.println(itr.next());
	int width=10;
	Double d2=()->{
		System.out.println("Firing "+width);
	};
		d2.draw();
}

	}

