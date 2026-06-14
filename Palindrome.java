// Solution for Palindrome Numbers

class Solution {
    public boolean isPalindrome(int x) {

    // Check Wheather X should greater than '0' or not
        if(x < 0){
            return false;
        }

        int og = x;
        int rev = 0;
        
    // Reverse Integer Logic
        while(x != 0){
            int y = x % 10;
            rev = rev * 10 + y;
            x = x / 10;
        }

            return og == rev;
    }
  
}
