package lab1;

public class Main {
    public static void main(String[] args){
        Course theCourse = new  IntroToProgrammingCourse("Basket Weaving", "TT212");
        Course otherCourse = new AdvancedJavaCourse("Java and Beyond", "T1000");
        Course finalCourse = new  IntroJavaCourse("Java it is not coffee", "J4565");



        printIt(theCourse);
        printIt(otherCourse);
        printIt(finalCourse);

    }

    public static void printIt(Course aCourse) {

        System.out.println(aCourse.getCourseName());
        System.out.println(aCourse.getCourseNumber());
        
    }
}
