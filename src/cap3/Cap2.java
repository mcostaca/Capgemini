package cap3;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Cap2 {
	
	
	public void anagrama(String e) {
		List<String> list = new ArrayList();
		char[] arr;
		List<String> ordr = new ArrayList();
		List<String> ordr2 = ordr;
		// dividindo em todas as substring possiveis
		for(int i=0;i<e.length();i++) {
			for(int j=0+i;j<e.length();j++) {
				String result = e.substring(i,j+1);
				list.add(result);
				}
			}
		
		// ordenando alfabeticamente as posições do arraylist
		for(int k = 0; k<list.size();k++) {
			arr = list.get(k).toCharArray();
			Arrays.sort(arr);
			String test = String.valueOf(arr);
			ordr.add(test);
			
			
		}
		//tentativa de retornar os valores iguais da arraylist ordenada
		for(int i=0;i<ordr.size();i++) {
			for(int j = 0;j<ordr.size();j++) {
				if(ordr.get(i).equals(ordr.get(j))==true) {
					//System.out.println(ordr);
					//System.out.println(ordr.get(i).equals(ordr.get(j)));
				}
			}
		}
		System.out.println(ordr);
		}
	
}

