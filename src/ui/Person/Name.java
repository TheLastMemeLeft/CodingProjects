package ui.Person;

public class Name{
    public static void main(String[] args){
        Person person1 = new Person("Jerry", "Smith", "Male","1010 beep boop Drive","92288393928392");
        Person person2 = new Person("Rick", "Sanchez","Male","nowhere lol","823489174913");
        person1.printName();
        person2.printName();
        person1.printInfo();
        person2.printInfo();



    }
}


