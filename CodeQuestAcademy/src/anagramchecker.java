
public class anagramchecker {
	boolean isAnagramSort(String string1, String string2) {
	    if (string1.length() != string2.length()) {
	        return false;
	    }
	    char[] a1 = string1.toCharArray();
	    char[] a2 = string2.toCharArray();
	    array.sort(a1);
	    Array.sort(a2);
	    return Array.equals(a1, a2);
	}
}
