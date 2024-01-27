
package PYQ2017U;
/*
NOTE: In this algorithm January and February are
      counted as months 13 and 14 of the previous
      year.E.g. if it is 2 February 2010, the 
      algorithm counts the date as the second day 
      of the fourteenth month of 2009 (02/14/2009 
      in DD/MM/YYYY format)
*/
public class Q4_DayOfTheWeek {
    int h,q,m,y,J,K;
    
    public Q4_DayOfTheWeek(int q, int m, int y) {
        this.q = q;
        this.m = m;
        this.y = y;
    }
    
    public boolean isValid() {
        if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            if(q > 31 || q < 1) {
                return false;
            } else {
                return true;
            }
        } else if(m == 4 || m == 6 || m == 9 || m == 11) {
            if(q > 30 || q < 1) {
                return false;
            } else {
                return true;
            }
        } else if(m == 2) {
            if(isLeap() && q == 29) {
                return true;
            } else if(!isLeap() && q == 28) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    public boolean isLeap() {
        return (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
    }
    
    public String display() {
        if(!isValid()) {
            return "Invalid input";
        }
        if(m == 1) {
            m = 13;
            y--;
        } else if(m == 2) {
            m = 14;
            y--;
        }
        J = y / 100;
        K = y % 100;
        h = (int) ( (q + Math.floor(13*(m+1)/5)) + K + Math.floor(K/4) + Math.floor(J/4) + (5*J) ) % 7;
        switch(h) {
            case 0: return "on Saturday";
            case 1: return "on Sunday";
            case 2: return "on Monday";
            case 3: return "on Tuesday";
            case 4: return "on Wednesday";
            case 5: return "on Thursday";
            case 6: return "on Friday";
            default: return "invalid input";
        }
    }
}
