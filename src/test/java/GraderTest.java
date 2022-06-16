import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void fiftyNineShouldReturnF() {
        Grader grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(59));
    }

    @Test
    void sixtyNineShouldReturnD() {
        Grader grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(69));
    }

    @Test
    void seventyNineShouldReturnC() {
        Grader grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(79));
    }

    @Test
    void eightyNineShouldReturnB() {
        Grader grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(89));
    }

    @Test
    void ninetyNineShouldReturnA() {
        Grader grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(99));
    }

    //edge cases
    @Test
    void ninetyShouldReturnA() {
        Grader grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(90));
    }


    // test scenerio that validates that edge case when we pass an eighty it returns B as it should
    @Test
    void eightyShouldReturnB() {
        Grader grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(80));
    }
    @Test
    void seventyShouldReturnC() {
        Grader grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(70));
    }
    @Test
    void sixtyShouldReturnD() {
        Grader grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(60));
    }

    @Test
    void zeroShouldReturnF() {
        Grader grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(0));
    }

    //we want to have a scenerio  if we send a negative number we verify that it s throwing an exception as it should

    @Test
    void negativeOneShouldReturnIllegalArgumentException() {

        Grader grader = new Grader();
        //this piece of code verifies that when this code is executed grader.determineLetterGrade(-1); it throws an illegal exception
        assertThrows(IllegalArgumentException.class,
                () -> {
            grader.determineLetterGrade(-1);
                });

    }

    @Test
    void trueShouldReturnFive() {

        Grader object = new Grader();
        //this piece of code verifies that when this code is executed grader.determineLetterGrade(-1); it throws an illegal exception
        assertThrows(IllegalArgumentException.class,
                () -> {
                    object.boolean1(false);
                });

    }

}