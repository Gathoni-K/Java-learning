/*
-Create a class Student with fields: name, age and grade

-provide 4 overloaded constructors:
1.only name.
2.name + age.
3.name + age + grade
4.all four fields

-Create at least 2 students with different constructors and print their details.

*/


package Notes.Constructor;

public class Student {
    String name;
    int age;
    String grade;
    String school;

    public Student(String name, int age, String grade, String school){
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.school= school;
    }

    public Student(String name){
            this(name, 0, "N/A", "N/A");
        
    }
    public Student(String name, int age) {
        this(name, age, "N/A", "N/A");
    }
    public Student(String name, int age, String grade){
        this(name, age, grade, "N/A");
    }

    @Override
    public String toString(){
        return 
            "Student:" + name + " " + age + " " + grade + " " + school;
        
    }

    public static void main(String[] args) {
        Student s1 = new Student("Jack",19);
        Student s2 = new Student("Jill", 20, "12");

        System.out.println(s1);
        System.out.println(s2);
    }
    
}
