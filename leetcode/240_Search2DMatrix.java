public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] i : matrix)
            if ( binSearch(i, target, 0, i.length - 1) == true )
                return true;
        return false;
    }
    
    public boolean binSearch(int[] matrix, int target, int ini, int fim){
        if (ini > fim ) return false;

        int meio = (ini + fim) / 2;
        if (matrix[meio] > target)
            return binSearch(matrix, target, ini, meio - 1 );
        else if (matrix[meio] < target)
            return binSearch(matrix, target, meio + 1, fim );
        else if (matrix[meio] == target)
            return true;
        return false;
    }
}
