
class CoffeMachine{

    public String makeCoffee(){
        return "Coffee";
    }
}

class  EdenMachine extends CoffeeMachine{

    public String makeCoffee(){
        return "Water";    // break expectation
    }
}


void main() {
    CoffeMachine coffeMachine= new EdenMachine();  // substitution
    System.out.println("makeCoffee = " + coffeMachine.makeCoffee());
}