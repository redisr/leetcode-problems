public class Solution {
    List<Integer> lista = new ArrayList<Integer>();
    
    public class Hash{
        int values[];
        int qtde[];
        
        public Hash(int tamanho){
            values = new int[tamanho];
            qtde = new int[tamanho];
            int i = 0;
            for (i = 0; i < tamanho; i ++) qtde[i] = 0;
        }
        
        public void add(int x){
            int pos = x % values.length;
            pos = (pos < 0) ? - pos : pos;
            
            do{
                if (values[pos] == x){
                    qtde[pos] ++;
                    break;
                }
                else if (qtde[pos] == 0){
                    values[pos] = x;
                    qtde[pos] ++;
                    break;
                }
                pos = (pos + 1) % values.length;
            }while (values[pos] != x || values[pos] != 0);
            if (qtde[pos] == values.length / 3 + 1) 
                lista.add(x);
        }
    }
    
    public List<Integer> majorityElement(int[] nums) {
        Hash hash = new Hash(nums.length);
        for (int num : nums){
            hash.add(num);
        }
        return lista;
    }
}
