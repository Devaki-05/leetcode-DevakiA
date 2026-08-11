// Last updated: 11/08/2026, 16:10:53
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int distance = 0;
        
        while (mainTank > 0) {
            // Consume 1 liter from main tank
            mainTank--;
            distance += 10;
            
            // Every 5 liters consumed, transfer 1 from additional if available
            if (distance % 50 == 0 && additionalTank > 0) {
                mainTank++;
                additionalTank--;
            }
        }
        
        return distance;
    }
}
