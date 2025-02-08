class Animal{
    int leg;
    int wings;
    int arms;
    String breed;
    String color;
    Animal(){

    }
    Animal(int leg, int wings, int arms, String breed, String color){
        this.leg = leg;
        this.wings = wings;
        this.arms = arms;
        this.breed = breed;
        this.color = color;
    }
    void display(){
        System.out.print("leg = "+this.leg);
        System.out.print("  |   wings = "+this.wings);
        System.out.print("  |   arms of = "+this.arms);
        System.out.print("  |   breed of = "+this.breed);
        System.out.println("    |   color of = "+this.color);
    }
}

public class P19_constructor {
    public static void main(String[] args) {
        Animal dog = new Animal();           //default constructor
        dog.leg = 4;
        dog.wings = 0;
        dog.arms = 0;
        dog.breed = "german shepherd";
        dog.color = "black-yello";
        Animal cat = new Animal(4,0,0,"persion","brown");
        dog.display();
        cat.display();
    }
}
