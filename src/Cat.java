public class Cat extends Animal{


  public void jump(double distance) {
    System.out.println("Cat jumped the distance of " + distance * 2 + " meters.");
  }

  public void showMood(boolean isHappy) {
    if (isHappy) {
      System.out.println("spinder");
    } else {
      System.out.println("hvæsser");
    }
  }

  public boolean eat(String foodType) {
    return true;
  }

  public void makeSound() {
    System.out.println("Miav");
  }
}
