package arrays;

public class PalindromeNumber {
    static boolean isPalindrome(int x){
        int reversed = 0;
        int original =x;

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }
        return (original==reversed);
    }
    public static void main(String[] args) {
        int x= 121;
        System.out.println(isPalindrome(x));

    }
}
