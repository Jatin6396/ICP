class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        List<Integer> ls =  new ArrayList<>();
        
        int left = 0 , top  = 0 , bottom = r-1, right = c-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                ls.add(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ls.add(arr[i][right]);
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                ls.add(arr[bottom][i]);
            }
            bottom--;}
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                ls.add(arr[i][left]);
            }
            left++;}
        }
        return ls;
    }
}