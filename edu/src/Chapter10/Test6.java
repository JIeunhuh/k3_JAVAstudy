package Chapter10;

import java.util.HashMap;
import java.util.Iterator;

public class Test6 {
	public static void main(String[] args) {
		String word[] = { "BUMBLEBEE", "HEAVEN", "ALTHOUGH", "WONDER" };
		String meaning[] = { "호박벌", "천국", "그럼에도 불구하고", "호기심이 들다" };

		//HashMap<> class
		HashMap<String, String> dic = new HashMap<String, String>();
		for (int i = 0; i < word.length; i++) {
			dic.put(word[i], meaning[i]);
		}
		System.out.println(dic.toString());
		
		System.out.println(dic.keySet()); //key 값 출력
		System.out.println(dic.values()); //value 값 출력
		
		Iterator<String> keys = dic.keySet().iterator(); //dic의 keySet을 호출해서 iterator 함?(중요)
		
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format(key,dic.get(key)));
		}
	
		
	}
}
