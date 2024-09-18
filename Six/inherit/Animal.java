package Six.inherit;

public class Animal {
    private int age;

    public Animal(int age) {
        super();
        this.age = age;
    }

    public Animal() {
        // niets
    }

    Integer agePackaged;
    protected String name;
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        age = newAge;
    }
}
