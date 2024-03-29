package Lambda;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class VotingProgram {
  
private static Map<Integer, Integer> sortVal(HashMap<Integer, Integer> hm) {
    // TODO Auto-generated method stub
    List<Map.Entry<Integer,Integer>> list=new LinkedList<Map.Entry<Integer,Integer>>(hm.entrySet());
    
    Collections.sort(list,Collections.reverseOrder((i1,i2)->i1.getValue().compareTo(i2.getValue())));
    
    HashMap<Integer, Integer> temp=new LinkedHashMap<Integer, Integer>();
    
    for(Map.Entry<Integer, Integer> y:list) {
      temp.put(y.getKey(), y.getValue());
    }
    return temp;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int votes,candi1=0,candi2=0,candi3=0;
    System.out.println("Vote to Candidate");
    System.out.println("press 1--->Candidate1");
    System.out.println("press 2--->Candidate2");
    System.out.println("press 3--->Candidate3");
    for(int i=1;i<=10;i++) {
      System.out.println("Vote No: "+i);
       votes=sc.nextInt();
       if(votes==1) {
         candi1=candi1+1;
       }
       else if(votes==2) {
         candi2=candi2+1;
       }
       else if(votes==3) {
         candi3=candi3+1;
       }
    }
    HashMap<Integer,Integer> hm=new HashMap<>();
    hm.put(1,candi1);
    hm.put(2,candi2);
    hm.put(3,candi3);
    
    Map<Integer,Integer> hm1=sortVal(hm);
    
    for(Map.Entry<Integer, Integer> val:hm1.entrySet()) {
//    System.out.println(val.getValue().compare(candi2, candi3));
      System.out.println("Candidate "+val.getKey()+" get "+val.getValue()+" votes.");
    }
    for(Map.Entry<Integer, Integer> val:hm1.entrySet()) {
      if(val.getValue()>=4) {
        System.out.println("Winner is candidate "+val.getKey());
      }
    }
  }

}