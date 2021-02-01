package packageTwo;

import java.util.ArrayList;
import java.util.List;

import packageOne.Book;

public class StoreUtil<T> {
	List<T> lst = new ArrayList<T>();
	
	public void addRecords(T bk) {
		lst.add(bk);
	}
	
	public List getRecords() {
		return (lst);
	}
	
	public int getNumOfRecords() {
		return lst.size();
	}

}
