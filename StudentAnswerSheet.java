
/**
 * Write a description of class StudentAnswerSheet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;

public class StudentAnswerSheet
{
    private List<String> answers;  // the list of the student's answers
    private String name;  // this student's name
    
    public StudentAnswerSheet(List<String> answers, String name)
    {
        this.answers = answers;
        this.name = name;
    }
    
    /** @param key the list of correct answers, represented as strings of length one
     * Precondition: key.size() is equal to the number of answers in this answer sheet
     * @return this student's test score
     */
    public double getScore(List<String> key)
    { 
        /* to be implemented in part 1 */ 
    
    }

    /** @return the name of the student */
    public String getName()
    { 
        return name; 
    }

    public static void main(String[] args)
    {
        // testing
    }
}
