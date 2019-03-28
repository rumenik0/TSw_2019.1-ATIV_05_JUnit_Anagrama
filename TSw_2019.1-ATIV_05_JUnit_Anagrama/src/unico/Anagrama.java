package unico;

import java.util.Arrays;

public class Anagrama implements IAnagrama {

	@Override
	public boolean isAnagramas(String str1, String str2) {
		
		if (str1 == null || str2 == null) return false;
		if (str1.isEmpty() || str2.isEmpty()) return false;
		
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		
		char[] a = str1.toCharArray();
	    char[] b = str2.toCharArray();
	    
	    Arrays.sort(a);
	    Arrays.sort(b);
	    
	    if (Arrays.equals(a, b)) 
	    	return true;
	    else 
	        return false;

	}
	
	public static String removeAcentuacao(String str) { 
		str = str.replaceAll("[a�����]","a");
		str = str.replaceAll("[?!]","");
		str = str.replaceAll("[�����]","A"); 
	    str = str.replaceAll("[�����]","a"); 
	    str = str.replaceAll("[����]","E"); 
	    str = str.replaceAll("[����]","e"); 
	    str = str.replaceAll("����","I"); 
	    str = str.replaceAll("����","i"); 
	    str = str.replaceAll("[�����]","O"); 
	    str = str.replaceAll("[�����]","o"); 
	    str = str.replaceAll("[����]","U"); 
	    str = str.replaceAll("[����]","u"); 
	    str = str.replaceAll("�","C"); 
	    str = str.replaceAll("�","c");  
	    str = str.replaceAll("[��]","y"); 
	    str = str.replaceAll("�","Y"); 
	    str = str.replaceAll("�","n"); 
	    str = str.replaceAll("�","N");
		return str;
	}
	
}
