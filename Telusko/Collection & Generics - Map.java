import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class FirstCode {
	public static void main(String[] args) throws Exception {
		Map<String,String> values = new HashMap<>();
		
		values.put("Name", "Pranik");
		values.put("Sirname", "Nikose");
		values.put("Occupation", "Student");
		
		 Set<String> keys = values.keySet();
 
		for(String k: keys)
		{
			System.out.println(k+" " +values.get(k));
		}
	}
}
