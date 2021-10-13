import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class FirstCode {
	public static void main(String[] args) throws Exception {
		Set<Integer> c = new HashSet<>();
		c.add(2);
		c.add(4);
		c.add(9);
		c.add(2); 
 
		for(int k: c)
		{
			System.out.println(k);
		}
	}
}
