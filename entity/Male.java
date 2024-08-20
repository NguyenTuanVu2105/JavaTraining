package entity;

public class Male extends Person implements CanTalk {
    @Override
    public void talk() {
        System.out.println("Nam");
    }
}