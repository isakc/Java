package collection;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {

	public static void main(String[] args) {
		
		/*
		 * Map : Key / Value로 구성 
		 * 
		 * -HashMap
		 * -TreeMap
		 * -HashTable
		 * 
		 * 자바스크립트의 객체는 속성명(String)과
		 * 속성값(Object)로 구성
		 * 
		 * Map은 Key(Object) / Value(Object)
		 */
		
		Map<String, Object> map = new HashMap<>();

		map.put("공조", "현빈");
		map.put("더킹", "정우성");
		map.put("공아수라", "정우성");
		map.put("공조", "유해진");
		
		Object o = map.get("공조");
	}//main() end

}//MapEx1 end
