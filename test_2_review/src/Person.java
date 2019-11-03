import java.util.ArrayList;


//1. Create and interface for parent class.
//2. Create a Parent class and a Child class.
//3. Create three constructors for Parent default, parameterized, and copy constructor.
//4. Create three constructors with super for the Child class.
//5. Implement what ever helper methods you need.
//6. Then create an array of reference objects, instantiate
// numerous objects within a for loop and load them into the array.
// then make it do something.


public abstract class Person implements Person_Interface{


    public static void main(String[] args) {

        //Declare the Arraylist that can hold Person class objects.
        ArrayList<Person> list1= new ArrayList<Person>(10);
        String[] names = new String[]{ "Joe","Micha-lyn","Aquilla","David","Sarah","David","Christian","Joshua","Harry","James"};

        for(int i = 0; i < 10; i++){
            //Create a new instance of the student subclass
            Student student = new Student(names[i],20+i);

            //Add the instance of the student object into the list.
            list1.add(student);
        }

        for(int i = 0; i < 10; i++){
            //print the age of each student object in the array.
            System.out.println(list1.get(i).ToString());

        }
    }



    //Member data name
    public String name = "";

    //Member data age
    public int age = 0;

    //Abstract method.
    public abstract String convert();


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

   //Copy constructor
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

    public String ToString(){
        return convert();
    }





}
