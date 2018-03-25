package lab2;

public class StartUp {

    public static void main(String[] args)
    {
        coursable  ajc = new AdvancedJavaCourse("BadJava", "888");

        System.out.println("Advanced Java Course");
        System.out.println(ajc.getCourseName());
        System.out.println(ajc.getCourseNumber());
        ajc.setCredits(3);
        System.out.println(ajc.getCredits());
        ajc.setPrerequisites("How to make nachos 101");
        System.out.println(ajc.getPrerequisites());
        System.out.println("");


        System.out.println("Intro Java Course");
        coursable iJC = new IntroJavaCourse("TacoJava", "5882300");
        System.out.println( iJC.getCourseName());
        System.out.println(iJC.getCourseNumber());
        iJC.setCredits(3);
        System.out.println(iJC.getCredits());
        iJC.setPrerequisites("Do Not Eat 20 Pies 101");
        System.out.println(iJC.getPrerequisites());
        System.out.println("");


        System.out.println("Intro to Programming Course");
        coursable iTPC = new IntroToProgrammingCourse("Programming for Dummis", "8673309");
        System.out.println( iTPC.getCourseName());
        System.out.println(iTPC.getCourseNumber());
        iTPC.setCredits(3);
        System.out.println(iTPC.getCredits());





    }


}
