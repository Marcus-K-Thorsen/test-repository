public class Dog extends Animal{



  public void showMood(boolean isHappy) {
    if (isHappy) {
      System.out.println("logrer");
    } else {
      System.out.println("knurrer");
    }
  }

  public boolean eat(String foodType) {
    return true;
  }

  public void makeSound() {
    System.out.println("Vuf");
  }
}
