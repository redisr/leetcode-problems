public class Solution {
    List <String> list = new ArrayList();

    public List<String> summaryRanges(int[] nums) {
        int tam = nums.length;
        if (tam < 2){
            if (tam == 0)
                return list;
            list.add("" + nums[0]);
            return list;
        }
        
        int ini = nums[0];
        int fim = nums[0];
        
        int i;
        for (i = 1; i < tam; i ++){
            if (nums[i] != fim+1 ){
                if (ini != fim)
                    list.add(ini + "->" + fim);
                else
                    list.add("" + ini);
                ini = nums[i];
            }
            fim = nums[i];
        }

        if(ini != fim)
            list.add(ini + "->" + fim);
        else
            list.add("" + fim);
        
        return list;
    }
}
