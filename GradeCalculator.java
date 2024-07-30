import java.util.Scanner;

public class GradeCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double totalMarks,percentage;
        String grade;

        System.out.println("Enter Your Marks:\nPhysics: ");
        double phym = sc.nextDouble();
        System.out.println("Chemistry: ");
        double chemm = sc.nextDouble();
        System.out.println("Maths: ");
        double mathm = sc.nextDouble();  

        totalMarks = phym+chemm+mathm;

        percentage = (totalMarks/3);

        if(percentage >= 90 || percentage <= 100){
            grade = "A";
        }
        else if(percentage >= 75 || percentage <= 90){
            grade = "B";
        }
        else if(percentage >= 50 || percentage <= 75){
            grade = "C";
        }
        else if(percentage >= 35 || percentage <= 50){
            grade = "D";
        }
        else{
            grade = "Fail";
        }

        System.out.println("Total Marks: "+totalMarks);
        System.out.println("Percentage: "+percentage);
        System.out.println("Grade: "+grade);
    }
}