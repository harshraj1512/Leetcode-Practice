class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int i = 0;
        int j = 0;
        int count = 0;
        while(i<startTime.length && j <endTime.length ){
            if(startTime[i] <= queryTime && endTime[j] >= queryTime){
                count++;
                i++;
                j++;
            } else{
                i++;
                j++;
            }
        }
        return count; 
    }
}