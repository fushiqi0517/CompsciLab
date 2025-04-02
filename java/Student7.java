import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

// Student7 class
class Student7 {
    // Instance variables
    private String name;
    private int[] grades;

    // Constructor
    public Student7(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public void setGrade(int spot, int grade) {
        if (spot >= 0 && spot < grades.length) {
            grades[spot] = grade;
        }
    }

    public String getName() {
        return name;
    }

    public int getSum() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum;
    }

    public int getNumberOfGrades() {
        return grades.length;
    }

    public double getAverage() {
        return getSum() / (double) getNumberOfGrades();
    }

    public double getAverageMinusLow() {
        return (getSum() - getLowestGrade()) / (double) (getNumberOfGrades() - 1);
    }

    public int getHighestGrade() {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public int getLowestGrade() {
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }

    @Override
    public String toString() {
        return name + " - " + Arrays.toString(grades);
    }
}