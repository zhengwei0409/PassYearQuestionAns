
package PYQ2017;

public class Q5_GradedActivity {
    private int score;
    
    public void setScore(int score) {
        this.score = score;
    }
    
    public int getScore() {
        return score;
    }
    
    public char getGrade(int score) {
        if(score >= 90) {
            return 'A';
        } else if(score >= 80) {
            return 'B';
        } else if(score >= 70) {
            return 'C';
        } else if(score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    
    public String toString() {
        return "Total Score: " + score + "\nEssay drade: " + getGrade(score);
    }
}
