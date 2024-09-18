package Six.inherit;

public class Lion extends Animal{
    public Lion(int age) {
        super(age);
    }

    protected void setProperties(int age, String n) {
        setAge(age);
        name = n;
    }
    public void roar() {
        System.out.println(name + "/" + getAge() + "/" + agePackaged);
//        setAge(agePackaged);
    }

    public static void main(String[] args){
        var lion = new Lion(30);
        lion.setProperties(3, "k");
        lion.roar();
    }
}
