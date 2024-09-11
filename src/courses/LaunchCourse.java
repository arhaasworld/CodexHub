package courses;

public class LaunchCourse {
    public static void main(String args[]){
        AllCourses ac = new AllCourses();

        ac.setiCourses(new Python());

        ac.setiCourses(new Java());
//
        ac.setiCourses(new JavaScript());

        Boolean status = ac.buyTheCourse(555.00);

        if(status)
            System.out.println("course purchased successfully " + ac);
        else
            System.out.println("This offer will end in 2 days!");
    }
}
