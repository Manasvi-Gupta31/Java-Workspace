// TYPE CONVERSIONS

// Set the maximum possible score in the game to 500.
public class Main_62 {
    public static void main(String args[]) {
int maxScore = 700;

// The actual score of the user
int userScore = 643;

/* Calculate the percentage of the user's score in relation to the maximum available score.
Convert userScore to double to make sure that the division is accurate */
double percentage = (double) userScore / maxScore * 100.0d;
System.out.println("User's percentage is " + percentage);


// Set the maximum possible marks in an exam to 1000

        int maxMarks = 1000;

        // Marks obtained by the student
        int obtainedMarks = 865;

        /* Calculate the percentage of marks
        Convert obtainedMarks to double for accurate division */
        double percent_age = (double) obtainedMarks / maxMarks * 100.0;

        System.out.println("Student's percentage is " + percent_age);
    }
}

