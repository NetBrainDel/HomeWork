public class ClassWorkOOP {

    // поля класса
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    int age;
    char sex;

    //Конструктор default
    ClassWorkOOP() {
        System.out.println("я здесь!");
        System.out.println("|||||||||||Конструктор");
    }

    //Конструктор с параметрами
    ClassWorkOOP(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;

        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getSex());
        System.out.println("  ");
    }
    //Конструктор с параметрами
    //Конструктор

    // методы класса

    public void say() {
        System.out.println("Hello");
    }

    public void run() {
        System.out.println("Running");
    }

    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Male: " + sex);
    }
}
