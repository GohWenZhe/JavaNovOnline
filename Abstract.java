
abstract class Car {
    abstract void displayPrice();

    void slogan() {
        System.out.println("Let's get some car");
    }
}

class Toyota extends Car {
    void displayPrice() {
        System.out.println("Price: 25,000 RM");
    }
}

class BMW extends Car {
    void displayPrice() {
        System.out.println("Price: 85,000 RM");
    }
}

class Tesla extends Car {
    void displayPrice() {
        System.out.println("Price: 75,000 RM");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Car car1 = new Toyota();
        car1.displayPrice();
        car1.slogan();

        System.out.println("====================================");

        Car car2 = new BMW();
        car2.displayPrice();
        car2.slogan();

        System.out.println("====================================");

        Car car3 = new Tesla();
        car3.displayPrice();
        car3.slogan();
    }
}
