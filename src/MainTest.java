public class MainTest {

  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();

    System.out.println("Dog then Cat");

    dog.makeSound();
    cat.makeSound();

    boolean isDogHappy = dog.eat("dogfood");
    boolean isCatHappy = cat.eat("fish");
    dog.showMood(isDogHappy);
    cat.showMood(isCatHappy);
    dog.showMood(false);
    cat.showMood(false);
    dog.jump(1.5);
    cat.jump(1.5);
  }
}
