public class QuackEcho implements Quackable {
    private Quackable duck;

    public QuackEcho(Quackable duck) {
        this.duck = duck;
    }

    public void quack() {
        duck.quack();

        System.out.println("Echo:");
        duck.quack();
    }
}
