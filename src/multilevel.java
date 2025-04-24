class Puppy extends Dog {
    public void puppy(){
        System.out.println("The puppy plays");
    }
}

public class multilevel{
    public static void main(String[] args){
        Puppy p = new Puppy();

        p.puppy();
        p.dog();
        p.animal();
    }
}