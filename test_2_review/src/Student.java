public class Student extends Person {

    //Child class default constructor with super
    Student(){
        super();
    }

    //Child class parameterized constructor which takes in name and age, with super.
    Student(String name, int age){
        super(name,age);
    }

    //Child copy constructor , with super.
    Student(Person person){
        super(person);
    }

}
