class PizzaCutter {
    public void cut() {
        System.out.println("Cutting pizza with pizza cutter");
    }
}

class Robot {
    private PizzaCutter cutter = new PizzaCutter(); // ❌ tight coupling

    public void cutPizza() {
        cutter.cut();
    }
}

/**
 * Problem
 * Cannot switch tool (e.g., Knife, Laser)
 * Robot depends on low-level class
 */