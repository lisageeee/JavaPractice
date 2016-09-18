public class AnagramSolver {
    public boolean isAnagram(String s, String t) {
        char[] charArr1 = s.toCharArray();
        char[] charArr2 = t.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        String newS = new String(charArr1);
        String newT = new String(charArr2);
        if(s.isEmpty() && t.isEmpty()) {
            return true;
        }
        if(newS.equals(newT)) {
            return true;
        }
        return false;
    }
}
