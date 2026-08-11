// Last updated: 11/08/2026, 16:11:01
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
       
        return (arrivalTime+delayedTime)%24;
        
    }
}