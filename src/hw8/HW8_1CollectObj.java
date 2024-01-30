package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class HW8_1CollectObj {

	public static void main(String[] args) {
		
//		Collection list = new ArrayList();
//		list.add(new Integer(100));
//		list.add(new Double(3.14));
//		list.add(new Long(21L));
//		list.add(new Short("100"));
//		list.add(new Double(5.1));
//		list.add("Kitty");
//		list.add(new Integer(100));
//		list.add(new Object());
//		list.add("Snoopy");
//		list.add(new BigInteger("1000"));
//		
//		
//		System.out.println("========使用傳統for========");
//		
//		for(int i = 0; i < list.size() ; i++) {
//			System.out.println(  ((ArrayList) list).get(i) );			
//		}
//		
//		System.out.println();
//		System.out.println("========使用Iterator========");
//		
//		Iterator objs = list.iterator();
//		while(objs.hasNext()) {
//			System.out.println(objs.next());
//		}
//		
//		System.out.println();
//		System.out.println("========使用foreach========");
//		
//		for(Object xx : list) {
//			System.out.println(xx);
//		}
		
		
		Collection<Number> list = new ArrayList();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
//		list.add("Kitty");
		list.add(new Integer(100));
//		list.add(new Object());
//		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		
		
		System.out.println("========使用傳統for========");
		
		for(int i = 0; i < list.size() ; i++) {
			System.out.println(  ((ArrayList) list).get(i) );			
		}
		
		System.out.println();
		System.out.println("========使用Iterator========");
		
		Iterator objs = list.iterator();
		while(objs.hasNext()) {
			System.out.println(objs.next());
		}
		
		System.out.println();
		System.out.println("========使用foreach========");
		
		for(Object xx : list) {
			System.out.println(xx);
		}
		
		
		
		
	}

}
