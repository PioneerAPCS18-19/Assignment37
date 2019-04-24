 


/**
 * Write a description of class AnswerSheetTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;

public class AnswerSheetTester
{
    public static void main(String[] args)
    {
        test1();
        test2();
    }
    
    public static void test1()
    {
        System.out.println("\n\n\nTest 1 (getScore):");
        String name = "Robert";
        System.out.println("Name: " + name);
        System.out.println("Answers given: A, B, A, D, E, C, D, A, A, ?");
        System.out.println("Key: A, A, A, D, C, C, D, A, A, A");
        
        List<String> sheet = new ArrayList<String>();
        List<String> key = new ArrayList<String>();
        
        sheet.add("A");
        sheet.add("B");
        sheet.add("A");
        sheet.add("D");
        sheet.add("E");
        sheet.add("C");
        sheet.add("D");
        sheet.add("A");
        sheet.add("A");
        sheet.add("?");
        
        key.add("A");
        key.add("A");
        key.add("A");
        key.add("D");
        key.add("C");
        key.add("C");
        key.add("D");
        key.add("A");
        key.add("A");
        key.add("A");
        
        StudentAnswerSheet student1 = new StudentAnswerSheet(sheet, name);
        
        double correctAns = 6.5;
        double calcAns = student1.getScore(key);
        System.out.println("Score for " + student1.getName() + ": " + calcAns);
        
        if(calcAns == correctAns)
        {
            System.out.println("Your getScore method is correct.");
        }
        else
        {
            System.out.println("Your getScore method is wrong. You should get " + correctAns);
        }
    }
    
    public static void test2()
    {
        System.out.println("\n\n\nTest 2 (highestScoringStudent):");
        
        String name1 = "Robert";
        String name2 = "Roberta";
        System.out.println("Name: " + name1);
        System.out.println("Answers given: A, B, A, D, E, C, D, A, A, ?");
        System.out.println("Key: A, A, A, D, C, C, D, A, A, A");
        System.out.println("Name: " + name2);
        System.out.println("Answers given: A, A, A, D, ?, C, D, A, A, B");
        System.out.println("Key: A, A, A, D, C, C, D, A, A, A");
        
        List<String> sheet1 = new ArrayList<String>();
        List<String> sheet2 = new ArrayList<String>();
        List<String> key = new ArrayList<String>();
        
        sheet1.add("A");
        sheet1.add("B");
        sheet1.add("A");
        sheet1.add("D");
        sheet1.add("E");
        sheet1.add("C");
        sheet1.add("D");
        sheet1.add("A");
        sheet1.add("A");
        sheet1.add("?");
        
        sheet2.add("A");
        sheet2.add("A");
        sheet2.add("A");
        sheet2.add("D");
        sheet2.add("?");
        sheet2.add("C");
        sheet2.add("D");
        sheet2.add("A");
        sheet2.add("A");
        sheet2.add("B");
        
        key.add("A");
        key.add("A");
        key.add("A");
        key.add("D");
        key.add("C");
        key.add("C");
        key.add("D");
        key.add("A");
        key.add("A");
        key.add("A");
        
        StudentAnswerSheet student1 = new StudentAnswerSheet(sheet1, name1);
        StudentAnswerSheet student2 = new StudentAnswerSheet(sheet2, name2);
        List<StudentAnswerSheet> sheets = new ArrayList<StudentAnswerSheet>();
        sheets.add(student1);
        sheets.add(student2);
        TestResults results = new TestResults(sheets);
        
        String correctName = "Roberta";
        String calcName = results.highestScoringStudent(key);
        System.out.println("Highest scoring student: " + calcName);
        
        if(correctName.equals(calcName))
        {
            System.out.println("Your highestScoringStudent method is correct.");
        }
        else
        {
            System.out.println("Your highestScoringStudent method is wrong. You should get " + correctName);
        }
    }
}
