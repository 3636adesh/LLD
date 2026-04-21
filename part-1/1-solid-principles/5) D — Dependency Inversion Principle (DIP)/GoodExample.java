interface Cutter {
    void cut();
}


class PizzaCutter implements Cutter {
    public void cut() {
        System.out.println("Cutting with pizza cutter");
    }
}

class Knife implements Cutter {
    public void cut() {
        System.out.println("Cutting with knife");
    }
}

class LaserCutter implements Cutter {
    public void cut() {
        System.out.println("Cutting with laser");
    }
}

class Robot {
    private Cutter cutter;

    public Robot(Cutter cutter) { // ✅ Dependency Injection
        this.cutter = cutter;
    }

    public void cutPizza() {
        cutter.cut();
    }
}


public class GoodExample {
    public static void main(String[] args) {

        Robot robot1 = new Robot(new PizzaCutter());
        robot1.cutPizza();

        Robot robot2 = new Robot(new Knife());
        robot2.cutPizza();

        Robot robot3 = new Robot(new LaserCutter());
        robot3.cutPizza();
    }
}