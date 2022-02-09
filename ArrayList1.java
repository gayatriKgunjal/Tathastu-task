import java.util.ArrayList;
import java.util.List;
 

public class ArrayList1 {
    
    public static void main(String[] args)
    {
        
        List<Integer> al = new ArrayList<>();
 
        
        al.add(1);
        al.add(2);
        al.add(30);
        al.add(5);
        al.add(7);
 
        
        System.out.println(al);
 
       
        al.remove(1);
 
        
        al.remove(2);
 
        
        System.out.println(al);
    }
}