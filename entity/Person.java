package entity;

public class Person {
    private String name;
    protected int age;
    private int height;
    private int weight;

    public double getBMI() {
        Double bmi = weight / ((height/100.0) * (height/100.0));
        System.out.println(bmi);
        return Math.round(bmi * 100) / 100.0;
    }
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
        if (age < 0) {
            throw new IllegalArgumentException("Age must be greater than 0");
        }
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public double getHeightInM() {
        return height/100.0;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
