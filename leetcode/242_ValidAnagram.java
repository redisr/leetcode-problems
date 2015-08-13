import java.util.concurrent.ConcurrentHashMap;
public class Solution {
    
    ConcurrentHashMap hash = new ConcurrentHashMap();
    
    public boolean isAnagram(String s, String t) {
        int qtd;
        
        for (char c : s.toCharArray()){
            qtd = (hash.containsKey(c)) ? (int) hash.get(c) + 1 : 1;
            hash.put(c, qtd);
        }
        for (char c : t.toCharArray()){
            if (!hash.containsKey(c)) return false;
            qtd = (int) hash.get(c) - 1;
            if (qtd == 0) hash.remove(c);
            else hash.put(c, qtd);
        }
        if(hash.size() == 0)
            return true;
            
        return false;
    }
}
