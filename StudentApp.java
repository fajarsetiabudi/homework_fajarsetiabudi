public class StudentApp{
    public static void main(String[] args){
       
        var student = new Student("Fajar Setia Budi", 27);
        

        System.out.println(student.name);
        System.out.println(student.age);

       student.studentSubject("Matematika");

    }
}