public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super.name = "Cat";
    }

    public void purr() {
        System.out.println(this.name + " purrs");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    public String getName() {
        return super.getName();
    }

    @Override
    public void makeNoise() {
        this.purr();
    }
}
