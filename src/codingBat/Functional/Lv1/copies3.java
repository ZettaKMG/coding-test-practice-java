package CodingBat.Functional.Lv1;

import java.util.List;

public class copies3 {
	public List<String> copies3(List<String> strings) {
		
		strings.replaceAll(s -> s + s + s);
		
		return strings;
		
	}	
}
