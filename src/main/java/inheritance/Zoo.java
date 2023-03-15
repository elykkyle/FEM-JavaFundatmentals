package inheritance;

public class Zoo {

    public static void main(String[] args) {
        Dog rocky = new Dog();
//        rocky.fetch();
//        rocky.makeSound();
//        feed(rocky);

        Animal sasha = new Dog();
        feed(sasha);
//        sasha.makeSound();

        sasha = new Cat();
//        sasha.makeSound();
        //cast sasha to class Cat to access scratch method.
//        ((Cat)sasha).scratch();
        feed(sasha);
    }

    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("Here's your dog food.");
        } else if (animal instanceof Cat) {
            System.out.println("Here's your cat food.");
        }
    }
}
