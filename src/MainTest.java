public class MainTest {

  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();

    dog.makeSound();
    cat.makeSound();

    boolean isDogHappy = dog.eat("dogfood");
    boolean isCatHappy = cat.eat("fish");
    dog.showMood(isDogHappy);
    cat.showMood(isCatHappy);
    dog.showMood(false);
    cat.showMood(false);
  }
}
