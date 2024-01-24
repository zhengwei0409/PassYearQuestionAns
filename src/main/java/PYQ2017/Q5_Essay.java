
package PYQ2017;

public class Q5_Essay extends Q5_GradedActivity {
    int grammar, spelling, length, content;
    
    public Q5_Essay(int grammar, int spelling, int length, int content) {
        this.grammar = grammar;
        this.spelling = spelling;
        this.length = length;
        this.content = content;
    }
    
    @Override
    public String toString(){
        return "Grammar: " + grammar + "\n" +
               "Spelling: " + spelling + "\n" + 
               "Length: " + length + "\n" + 
               "Content: " + content + "\n"; 
    }
}
