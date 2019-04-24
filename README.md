# Assignment 37

Skeleton classes are provided for parts 1 and 2 below. Use `main` with test methods to make sure your code works. 

## Part 1

A positive integer is called a "self-divisor" if every decimal digit of the number is a divisor of the number, that is, the number is evenly divisible by each and every one of its digits. For example, the number 128 is a self- divisor because it is evenly divisible by 1, 2, and 8. However, 26 is not a self-divisor because it is not evenly divisible by the digit 6. Note that 0 is not considered to be a divisor of any number, so any number containing a 0 digit is NOT a self-divisor. There are infinitely many self-divisors.

1. Write method `isSelfDivisor`, which takes a positive integer as its parameter. This method returns true if the number is a self-divisor; otherwise, it returns false.

2. Write method `firstNumSelfDivisors`, which takes two positive integers as parameters, representing a start value and a number of values. Method `firstNumSelfDivisors` returns an array of size num that contains the first num self-divisors that are greater than or equal to start. For example, the call `firstNumSelfDivisors(10, 3)` should return an array containing the values 11, 12, and 15, because the first three self-divisors that are greater than or equal to 10 are 11, 12, and 15. In writing `firstNumSelfDivisors`, make sure you use the method `isSelfDivisor`.

## Part 2

Consider a system for processing student test scores. The following class will be used as part of this system and contains a student's name and the student's answers for a multiple-choice test. The answers are represented as strings of length one with an omitted answer being represented by a string containing a single question mark ("?"). These answers are stored in an `ArrayList` in which the position of the answer corresponds to the question number on the test (question numbers start at 0). A student's score on the test is computed by comparing the student's answers with the corresponding answers in the answer key for the test. One point is awarded for each correct answer and 1/4 of a point is deducted for each incorrect answer. Omitted answers (indicated by "?") do not change the student's score.

1. Write the `StudentAnswerSheet` method `getScore`. The parameter passed to method `getScore` is an `ArrayList` of strings representing the correct answer key for the test being scored. The method computes and returns a double that represents the score for the student's test answers when compared with the answer key. One point is awarded for each correct answer and 1⁄4 of a point is deducted for each incorrect answer. Omitted answers (indicated by "?") do not change the student's score.

2. The following table shows an example of an answer key, a student's answers, and the corresponding point values that would be awarded for the student's answers. In this example, there are six correct answers, three incorrect answers, and one omitted answer. The student's score is ((6 \* 1) - (3 \* 0.25)) = 5.25.

|   #   | 0  |  1  |  2   |   3 |   4 |   5 |   6 |   7 |   8 |   9 |
|:---|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|
|   key |   "A" |   "C" |   "D" |   "E" |   "B" |   "C" | "E"   |   "B" |   "B" |   "C" |
|   answers |   "A" |   "B" |   "D" |   "E" |   "A" |   "C" | "?"   |   "B" |   "D" |   "C" |  
|   points  |   1   |   -0.25   |   1   |   1   |   -0.25   |   1   |   0   |   1   |   -0.25   |   1   |

Write the `TestResults` method `highestScoringStudent`, which returns the name of the student who received the highest score on the test represented by the parameter `key`. If there is more than one student with the highest score, the name of any one of these highest-scoring students may be returned. You may assume that the size of each answer sheet represented in the `ArrayList` `sheets` is equal to the size of the `ArrayList` `key`. In writing `highestScoringStudent`, be sure to use the `getScore` method.

Run the `AnswerSheetTester` class to test your methods in `StudentAnswerSheet` and `TestResults`. It will tell you if your methods are correct or if they need to be fixed.

### Grading

Please make sure you have comments for every method you create. As always, your program will be graded on its functionality according to the project specifications and proper code style.
