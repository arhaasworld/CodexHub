package courses;

public class Python implements ICourses{
    @Override
    public Boolean buyCourses(Double amount) {
        System.out.println("Python course purchased and the price paid is  " + amount);
        return true;
    }
}
