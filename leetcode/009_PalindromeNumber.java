public class Solution {
    
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x-invert(x, 0) == 0) return true;
        
        return false;
    }
    
    public int invert(int x, int inv){
        int aux = x / 10;
        
        while (aux > 0) {
            inv = inv * 10 + x % 10;
            x = aux;
            aux /= 10;
        }
        
        return inv * 10 + x;
    }
}

