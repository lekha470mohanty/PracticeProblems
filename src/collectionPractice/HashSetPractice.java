package collectionPractice;

import java.util.HashSet;

public class HashSetPractice {

	public static void main(String[] args) {
		//HashSet <Integer> hs=new HashSet<Integer>();
		HashSet<String> hs1=new HashSet<String>();		
		//Add values
//		hs.add(3);
//		hs.add(2);
//		hs.add(4);
//		hs.add(7);
		
		hs1.add("geeks");
		hs1.add("fghfgfg");
		hs1.add(null);
		hs1.add("practice");
		hs1.add("contribute");
		hs1.add(null);
		hs1.add("contribute");
		
		System.out.println(hs1);
		
//		for(int i=0;i<hs1.size();i++) {
//			if(hs1.contains(i)) {
//				System.out.println(i);
//			}
//			else {
//				System.out.println("i was not fount in hashset");
//			}
//			
//		}
//		System.out.println(hs.size());
	}

}
