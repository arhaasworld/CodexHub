package courses;

public class AllCourses {
    private ICourses iCourses;


    public AllCourses(ICourses iCourses) {
        this.iCourses = iCourses;
    }
    public AllCourses(){
        super();
    }

    public void setiCourses(ICourses iCourses) {
        this.iCourses = iCourses;
    }

    public Boolean buyTheCourse(Double amount){
        return iCourses.buyCourses(amount);

    }

}
