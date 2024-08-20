package entity;

public class Female extends Person implements CanTalk {
    @Override
    public void talk() {
        System.out.println("Nữ");
    }
}
