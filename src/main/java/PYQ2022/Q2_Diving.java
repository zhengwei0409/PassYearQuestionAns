
package PYQ2022;

public class Q2_Diving {
    private String name, country;
    private double[][] judgesScore;
    private double[] difficultyRating;
    
    public Q2_Diving(String name, String country, double[][] judgesScore, double[] difficultyRating) {
        this.name = name;
        this.country = country;
        this.judgesScore = judgesScore;
        this.difficultyRating = difficultyRating;
    }
    
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
    
    public double computeScore() {
        double totalScore = 0;
        
        
        for(int i = 0; i < judgesScore.length; i++) {
            // bubble sort
            for(int j = 0; j < judgesScore[i].length - 1; j++) {
                for(int z = 0; z < judgesScore[i].length - j - 1; z++) {
                    if(judgesScore[i][z] < judgesScore[i][z+1]) {
                        double temp = judgesScore[i][z];
                        judgesScore[i][z] = judgesScore[i][z+1];
                        judgesScore[i][z+1] = temp;
                    }
                }
            }
        }
        
        
        for(int i = 0; i < judgesScore.length; i++) {
            double sumScore = 0;
            
            for(int j = 0; j < judgesScore[i].length; j++) {
                sumScore += judgesScore[i][j];
            }
            
            totalScore += (sumScore - judgesScore[i][0] - judgesScore[i][1] - judgesScore[i][5] - judgesScore[i][6]) * difficultyRating[i];
        }
        
        return totalScore;
        
    }
    
    public String toString() {
        String result = "Diver : "  + name + " (" + country + ")";
        for(int i = 0; i < judgesScore.length; i++) {
            result += "\nJudges Score : ";
            for(int j = 0; j < judgesScore[i].length; j++) {
                result += judgesScore[i][j] + " ";
            }
            result += "\nDifficulty Rating : " +  difficultyRating[i];
        }
        result += "\nFinal Score : " + computeScore() + "\n";
        return result;
    }
}
