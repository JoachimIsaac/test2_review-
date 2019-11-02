import java.util.ArrayList;


//1. Create and interface for parent class.
//2. Create a Parent class and a Child class.
//3. Create three constructors for Parent default, parameterized, and copy constructor.
//4. Create three constructors with super for the Child class.
//5. Implement what ever helper methods you need.
//6. Then create an array of reference objects, instantiate
// numerous objects within a for loop and load them into the array.
// then make it do something.


public class Person implements Person_Interface{


    public static void main(String[] args) {

        //Declare the Arraylist that can hold Person class objects.
        ArrayList<Person> list1= new ArrayList<Person>(10);

        for(int i = 0; i < 10; i++){
            //Create a new instance of the student subclass
            Student student = new Student("Joe",i);

            //Add the instance of the student object into the list.
            list1.add(student);
        }

        for(int i = 0; i < 10; i++){
            //print the age of each student object in the array.
            System.out.println("Student "+ i +" Here is my age: "+list1.get(i).get_age());
        }
    }

    //member data name
    private String name = "";

    //member data age
    private int age = 0;


    //Default constructor
    public Person(){
        this.name = "Bob";
        this.age = 16;
    }

    //Parameterized constructor.
   public Person(String name,int age){
        this.name = name;
        this.age = age;
   }

   //copy constructor
    public Person(Person person){
        this.name = person.name;
    }



    @Override
    public int get_age() {
        return age;
    }

    @Override
    public String get_name() {
        return name;
    }

    @Override
    public void set_name(String name) {
        this.name = name;
    }

    @Override
    public void set_age(int age) {
        this.age = age;
    }

}
