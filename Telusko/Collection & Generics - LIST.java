import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

class FirstCode {
	public static void main(String[] args) throws Exception {
		List c = new ArrayList();
		c.add(1);
		c.add(2);
		c.add(3);
		c.add("4");
 
		for(Object k: c)
		{
			System.out.println(k);
		}
	}
}
