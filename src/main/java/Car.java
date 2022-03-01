public class Car {
    private String mark;
    private String clas;
    private int ves;

    public Car(String mark, String clas,int ves){
        this.mark = mark;
        this.clas = clas;
        this.ves = ves;
    }

    public void start(){
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", clas='" + clas + '\'' +
                ", ves=" + ves +
                '}';
    }

}