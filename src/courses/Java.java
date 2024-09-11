package courses;

public class Java implements ICourses{
    @Override
    public Boolean buyCourses(Double amount) {
        System.out.println("Java course purchased and the price paid is " + amount);
        return true;
    }
}
