
/**
 * write code based on image : docs/images/interface-segregation.webp
 *
 */
interface Spinable {
    void spin();
}

interface ArmRotatable {
    void rotateArms();
}

interface AntennaWiggable {
    void wiggleAntennas();
}


class BasicRobot implements Spinable, ArmRotatable {

    public void spin() {
        System.out.println("Spinning...");
    }

    public void rotateArms() {
        System.out.println("Rotating arms...");
    }
}

class AdvancedRobot implements Spinable, ArmRotatable, AntennaWiggable {

    public void spin() {
        System.out.println("Spinning...");
    }

    public void rotateArms() {
        System.out.println("Rotating arms...");
    }

    public void wiggleAntennas() {
        System.out.println("Wiggling antennas...");
    }
}

public class GoodExample {
    public static void main(String[] args) {

        BasicRobot basic = new BasicRobot();
        basic.spin();
        basic.rotateArms();

        AdvancedRobot advanced = new AdvancedRobot();
        advanced.spin();
        advanced.rotateArms();
        advanced.wiggleAntennas();
    }
}