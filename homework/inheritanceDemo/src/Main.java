public class Main {
    public static void main(String[] args) throws Exception {

        Student student=new Student();
        student.setId(1);
        student.setFirstName("sezer");
        student.setLastName("bozbıyık");
        student.setEmail("sezer.bzbyk@gmail.com");
        student.setPassword("12345");

        

        System.out.println(student.getFirstName()+" "+student.getLastName());

        

        
        
    }
}
