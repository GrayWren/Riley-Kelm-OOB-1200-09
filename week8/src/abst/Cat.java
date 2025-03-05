package abst;

 class Cat extends Animal{
     @Override
     public void animalSound(){
         System.out.println("This is a cat");
     }
     public void sound(){
         System.out.println("cat says meow");
     }
}
