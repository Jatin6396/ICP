class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i=0;i<m;i++){
            q.add(nums1[i]);
        }
        for(int i=0;i<n;i++){
            q.add(nums2[i]);
        }
         int i = 0;
        while (!q.isEmpty()) {
            nums1[i++] = q.poll();
        }
    }
}