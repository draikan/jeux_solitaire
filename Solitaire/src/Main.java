import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
		
    	

ArrayList<ArrayList<String>> dom=new ArrayList<ArrayList<String>>();
ArrayList<String> test = new ArrayList<String> ();
ArrayList<String> test2 = new ArrayList<String> ();
 
test.add("C");
test.add("S");
 
test2.add("K");
test2.add("R");
 
dom.add(test);
dom.add(test2);
 
for(int i = 0 ; i < dom.get(0).size();i++)
System.out.println(dom.get(0).get(i));
}
}
