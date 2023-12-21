//https://leetcode.com/problems/valid-anagram/



class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
     if (s.length() != t.length()) return false;

     int [] result = new int[26];

     for (int i = 0; i< s.length(); i++) {
         result[s.charAt(i) - 'a'] ++;
         result[t.charAt(i) - 'a'] --;
     }

     for (int val: result) if(val != 0 ) return false;
     return true;

}

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
     }
}
