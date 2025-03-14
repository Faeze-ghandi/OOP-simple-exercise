public class Main {
    public static void main(String[] args) {
        Person person1=new Person("Ali" , 22);
        Person person2=new Person("Sara" , 15);

        person1.displayInfo();
        person2.displayInfo();

        person1.checkAge();
        person2.checkAge();
    }
}