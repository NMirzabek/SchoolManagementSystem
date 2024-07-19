package PDP.MirzabekN;

public class Teacher extends Person{
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " Teacher";
    }
}
