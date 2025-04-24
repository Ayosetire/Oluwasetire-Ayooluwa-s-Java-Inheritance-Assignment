class Cat extends Animal{
    public void cat(){
        System.out.println("This is cat");
    }
}
class Horse extends Animal{
    public void horse(){
        System.out.println("This is Horse");
    }
}

public class hierarchical {
    public static void main(String[] args){
        Cat c  = new Cat();
        Horse h = new Horse();

        c.cat();
        c.animal();
        h.horse();
        h.animal();
    }
}
