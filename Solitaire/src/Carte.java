import java.util.ArrayList;
import java.util.Random;

public class Carte {

	private  int val ;
    private int type ;
    
    
    public Carte(int val , int type )
    {
        this.val=val ; 
        this.type=type; 
    }
    
    public int getVal()
    {
        return val ; 
    }
    
    public int getType()
    {
        return type ; 
    }
    
    
    public void print() {
        String[] colors = {"Car","Coe","Tre","Piq"};
        String[] values = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
       //System.out.print(colors[val] + values[type]);

    }
}
