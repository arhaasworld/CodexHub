package courses;

public class JavaScript implements ICourses{
    @Override
    public Boolean buyCourses(Double amount) {
        System.out.println("Java script course purchased and the price paid is " + amount);
        return true;
    }
}
