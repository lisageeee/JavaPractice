public class ReverseString {
    // First solution: use a string buffer
    public String reverseStringOne(String s) {
        StringBuffer str = new StringBuffer(s);
        return str.reverse().toString();
    }
    // Second Solution: use a lopp and char arrays
    public String reverseStringTwo(String s) {
        char[] arr = new char[s.length()];
        char[] orig = s.toCharArray();
        for(int i=0, j=s.length()-1; i<s.length(); i++, j--) {
            arr[i] = orig[j];
        }
        String sol = new String(arr);
        return sol;
    }
}
