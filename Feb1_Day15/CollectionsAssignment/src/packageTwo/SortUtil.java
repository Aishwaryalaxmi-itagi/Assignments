package packageTwo;

import java.util.Collections;

public class SortUtil {
	
	public void sortByName(StoreUtil str) {
		CompareBooksByName cbn =new CompareBooksByName();
		Collections.sort(str.lst,cbn);
		System.out.println(str.lst);
	}
	
	public void sortByPrice(StoreUtil str) {

		CompareBooksByPrice cbp=new CompareBooksByPrice();
		Collections.sort(str.lst, cbp);
		System.out.println(str.lst);
	}

}
