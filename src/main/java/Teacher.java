public class Teacher extends Person {

    public Teacher(int age, String fullName) {
        super(age, fullName);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void print() {
        System.out.println("Я учитель");
    }

}