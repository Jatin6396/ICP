class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int i = 0;
        int j = people.length-1;
        int boat = 0;
        Arrays.sort(people);
        while(i<=j){
            if(people[j]==limit){
                boat++;
                j--;
            }
            else if(people[i]+people[j]<=limit){
                boat++;
                j--;
                i++;
            }else if(i==j){
                boat++;
                break;
            }
            else if(people[i]+people[j]>limit){
                j--;
                boat++;
            }
        }

        return boat;
    }
}