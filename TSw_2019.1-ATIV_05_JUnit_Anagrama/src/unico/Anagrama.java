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
		str = str.replaceAll("[aáàãâä]","a");
		str = str.replaceAll("[?!]","");
		str = str.replaceAll("[ÂÀÁÄÃ]","A"); 
	    str = str.replaceAll("[âãàáä]","a"); 
	    str = str.replaceAll("[ÊÈÉË]","E"); 
	    str = str.replaceAll("[êèéë]","e"); 
	    str = str.replaceAll("ÎÍÌÏ","I"); 
	    str = str.replaceAll("îíìï","i"); 
	    str = str.replaceAll("[ÔÕÒÓÖ]","O"); 
	    str = str.replaceAll("[ôõòóö]","o"); 
	    str = str.replaceAll("[ÛÙÚÜ]","U"); 
	    str = str.replaceAll("[ûúùü]","u"); 
	    str = str.replaceAll("Ç","C"); 
	    str = str.replaceAll("ç","c");  
	    str = str.replaceAll("[ıÿ]","y"); 
	    str = str.replaceAll("İ","Y"); 
	    str = str.replaceAll("ñ","n"); 
	    str = str.replaceAll("Ñ","N");
		return str;
	}
	
}
