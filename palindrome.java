public class palindrome {
  public static void main(String[] args) {
    String word = "racecar";
    System.out.println(isPalindrome(word));
    word = "mop";
    System.out.println(isPalindrome(word));    
  }

  public static int isPalindrome(String str){
    int n = str.length();
    for ( int i = 0; i < n/2; i ++ )
      if (str.charAt(i) != str.charAt(n-i-1)) return -1;
    return n / 2;
  }
}
