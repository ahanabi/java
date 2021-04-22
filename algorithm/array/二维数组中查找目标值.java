package array;

class Solution {
    public static boolean getTarget(int[][] array, int target) {
        if(array == null || array.length == 0)
            return false;
        int row=0;
        int column=array[0].length-1;
        while(row<array.length&&column>=0){
            if(array[row][column]==target){
                return true;
            }
            if(array[row][column]>target){
                column--;
            }else{
                row++;
            }
        }
        return false;
    }
}
class Solution2{
    public boolean find(int[][]array,int target){
        if(array==null||array.length==0){
            return false;
        }
        int left=0;
        int right=array.length*array[0].length-1;
        int col=array[0].length;
        while(left<=right){
            int mid=(left+right)/2;
            int value=array[mid/col][mid%col];
            if(value==target){
                return true;
            }else if(value<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return false;
    }
}