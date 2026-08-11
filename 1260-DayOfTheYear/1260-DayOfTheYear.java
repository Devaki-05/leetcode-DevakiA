// Last updated: 11/08/2026, 16:13:12
class Solution {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (month > 2 && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
            day += 1;
        }
        
        for (int i = 0; i < month - 1; i++) {
            day += daysInMonths[i];
        }
        
        return day;
    }
}