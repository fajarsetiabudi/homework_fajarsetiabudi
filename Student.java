class Student extends Academician{
   
    int grade;
    
    Student(String name, int  age) {
        super(name, age);
        
    }


    void studentSubject(String subject) {
    
        System.out.println("Hallo guys" +", My name is " + this.name + ", My Age "
        + this.age + " years old" + ", The subject I don't like is " + subject + ", and Iam a student at Digital Skola");

    }
}