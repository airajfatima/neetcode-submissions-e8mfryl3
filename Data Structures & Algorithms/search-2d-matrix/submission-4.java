class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length; // 2
        int top = 0, bottom = matrix.length - 1;
        int mid = (top + bottom) / 2; //0
        while(top <= bottom){
            mid = (top + bottom) / 2;
            System.out.println(mid);
            System.out.println(n);
            if(matrix[mid][0] == target)
                return true;
            else if(matrix[mid][0] > target && matrix[mid][n - 1] > target){
                bottom = mid - 1;
            }
            else if(matrix[mid][0] > target && matrix[mid][n - 1] <= target){
                break;
            }
            else if(matrix[mid][0] < target && matrix[mid][n - 1] < target){
                top = mid + 1;
            }
            else if(matrix[mid][0] < target && matrix[mid][n - 1] >= target){
                break;
            }
        }
        int left = 0, right = matrix[0].length - 1;
        while(left <= right){
            int mid1 = (left + right) / 2;
            if(matrix[mid][mid1] == target) return true;
            else if(matrix[mid][mid1] > target) right = mid1 - 1;
            else left = mid1 + 1;
        }
        return false;
    }
}
