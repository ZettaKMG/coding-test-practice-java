package CodingBat.Functional.Lv1;

import java.util.List;

public class square {
	public List<Integer> square(List<Integer> nums) {
		
		nums.replaceAll(n -> n * n);
		
		return nums;
		
	}
}
