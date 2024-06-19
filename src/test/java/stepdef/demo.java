package stepdef;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class demo {

	public static void main(String[] args) {
		int  max_value = 0;
		int [] nums = {2,2,1,1,1,2,2,2};
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i :nums) {
			if(!map.containsKey(i)) {
				map.put(i, 1);
			}
			else if (map.get(i)>= nums.length/2) {
				System.out.println(i); 
			}
			else {
				map.put(i,map.get(i)+1);
			}
		}

		for(Map.Entry<Integer, Integer>entry: map.entrySet()) {
			 if(entry.getValue()>nums.length/2) {
				 max_value = entry.getKey();
			 }
		}
		
		System.out.println(max_value);
	}
	
	
}
