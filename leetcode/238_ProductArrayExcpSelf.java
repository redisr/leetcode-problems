public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int tam = nums.length;
        int[] result = new int[tam];

        int i, ac = nums[0];
        result[0] = 1;
        result[1] = nums[0];

        for (i = 1; i < tam - 1; i++){
            ac = ac * nums[i];
            result[i + 1] = ac;
        }
        ac = 1;
        for(i = tam - 2; i >= 0; i--){
            ac = ac * nums[i + 1];
            result[i] = result[i] * ac;
        }
        
        return result;
    }
}
