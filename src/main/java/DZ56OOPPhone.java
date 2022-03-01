public class DZ56OOPPhone {
    private int number;
    private String model;
    private int weight;

    public DZ56OOPPhone() {

    }

    public DZ56OOPPhone (int number, String model) {
        this.number = number;
        this.model = model;
    }

    public DZ56OOPPhone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + number);
    }

    public void sendMessage(int...numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}