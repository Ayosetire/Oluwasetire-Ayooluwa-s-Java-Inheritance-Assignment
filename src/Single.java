class Animal{
    public void animal(){
        System.out.println("This is Animal");
    }
}

class Dog extends Animal{
    public void dog(){
        System.out.println("This is Dog");
    }
}

public class Single {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.animal();
        d.dog();

    }
}