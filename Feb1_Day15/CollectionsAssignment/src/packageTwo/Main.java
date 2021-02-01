package packageTwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import packageOne.Book;

public class Main {
public static void main(String[] args) {
	
	Set<String> s1=new HashSet<String>();
	s1.add("xyz");
	s1.add("XYZ");
	Book bk1=new Book(101, "ABC", s1, 200); 
	
	Set<String> s2=new HashSet<String>();
	s2.add("lnm");
	s2.add("LMN");
	Book bk2=new Book(102, "PQR", s2, 250); 
	
	Set<String> s3=new HashSet<String>();
	s3.add("pqr");
	s3.add("PQR");
	Book bk3=new Book(103, "UVW", s3, 100);
	
	StoreUtil str=new StoreUtil();
	str.addRecords(bk1);
	str.addRecords(bk2);
	str.addRecords(bk3);
	
	System.out.println(str.getRecords());
	
	System.out.println("Number of Records: "+str.getNumOfRecords());
	
	SortUtil sort1=new SortUtil();
	sort1.sortByName(str);
	
	sort1.sortByPrice(str);
	
	
}
}
