package dsalgo.string;

import java.util.Hashtable;

public class IsUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(IsUnique.isUniqueUsingHashTable("ilovemysun"));
		System.out.println(IsUnique.isUniqueUsingHashTable("muskanagrawal"));
		System.out.println(IsUnique.isUniqueUsingHashTable("m"));
		System.out.println(IsUnique.isUniqueUsingHashTable("mmmm"));
		System.out.println(IsUnique.isUniqueUsingHashTable("\n"));
		System.out.println(IsUnique.isUniqueUsingHashTable(null));
	}
	
	public static boolean isUniqueUsingHashTable(String str) {
		
		Hashtable<Character, Integer> hash = new Hashtable<Character, Integer>();
		
		//check for null or empty string
		if(str == null || str =="")
			return false;
		Character c = str.charAt(0);
		int i = 0;
		while(true) {
			//if character reappeared, return false
			if(hash.containsKey(c))
				return false;
			
			else
				hash.put(c, 1);

			i++;
			if(i<str.length())
				c=str.charAt(i);
			else
				break;
		}
		return true;
	}

}
