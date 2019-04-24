
/**
 * Write a description of class TestResults here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;

public class TestResults
{
    private List<StudentAnswerSheet> sheets; 
    
    public TestResults(List<StudentAnswerSheet> sheets)
    {
        this.sheets = sheets;
    }

    /** 
     * Precondition: sheets.size() > 0;
     * all answer sheets in sheets have the same number of answers 
     * 
     * @param key the list of correct answers represented as strings of length one
     * Precondition: key.size() is equal to the number of answers in each of the answer sheets in sheets
     * 
     * @return the name of the student with the highest score
     */
    public String highestScoringStudent(List<String> key)
    { 
        /* to be implemented in part 2 */ 
    
    }
}
