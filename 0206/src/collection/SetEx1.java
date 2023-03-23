package collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class SetEx1 {
	public static void main(String[] args) {
		
		/*
		 * Set: index가 없음 / 중복허용
		 * 
		 * -HashSet(정렬안됨)
		 * -TreeSet(정렬됨)
		 * 
		 * List : index가 있음 / 중복허용
		 * 
		 * 
		 */
		
		List<Integer> nums = new Vector<>();
		
		nums.add(4);
		nums.add(4);
		nums.add(4);
		nums.add(4);
		nums.add(4);

		System.out.println(nums.size());
		
		Set<Integer> set = new HashSet<>();
		
		set.add(9);
		set.add(4);
		set.add(2);
		set.add(3);
		set.add(1);
		
		for(Integer i :set){
			System.out.println(i);
		}
		
	}//main end
}//SetEx1 end
