public class Grader {

    public void boolean1(boolean param) {
        if(param == false) {
            throw new IllegalArgumentException("param cannot be false");

        }
        else {
            System.out.println("x = 5" );
        }
    }

    public char determineLetterGrade (int numberGrade) {
        if (numberGrade < 0) {
            throw new IllegalArgumentException("Number grade cannot be negative");
            //return 'F';
        } else if (numberGrade < 60) {

            return 'F';
        } else if (numberGrade < 70) {
            return 'D'; }
        else if (numberGrade < 80) {
            return 'C';}
        else if (numberGrade < 90) {
            return 'B';} else {
            return 'A'; }}}
