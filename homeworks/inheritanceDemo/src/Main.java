public class Main {
    public static void main(String[] args) throws Exception {

        Course course1 = new Course();
        course1.id = 1;
        course1.courseName = "Java";

        Course course2 = new Course();
        course2.id=2;
        course2.courseName="C#";

        Student student=new Student();
        student.setId(1);
        student.setFirstName("sezer");
        student.setLastName("bozbıyık");
        student.setEmail("sezer.bzbyk@gmail.com");
        student.setPassword("12345");

        System.out.println(student.getFirstName()+" "+student.getLastName());

        
        
    }
}
