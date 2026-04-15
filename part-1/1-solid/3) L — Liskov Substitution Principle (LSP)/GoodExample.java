/**
 * write code based on image : docs/images/liskov-substitution.webp
 *
 */

class Coffee {

    String type;

    Coffee(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class CoffeeMachine {
    public Coffee makeCoffee() {
        return new Coffee("Regular Coffee");
    }
}

class EdenMachine extends CoffeeMachine {
    public Coffee makeCoffee() {
        return new Coffee("Cappuccino"); //still a type of coffee
    }
}

void main() {
    CoffeeMachine machine = new EdenMachine(); // substitution

    Coffee coffee = machine.makeCoffee();
    System.out.println(coffee.getType());  // o/p --> Cappuccino
}

// Cappuccino = valid coffee