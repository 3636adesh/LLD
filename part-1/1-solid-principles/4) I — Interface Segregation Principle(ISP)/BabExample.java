


/**
 * write code based on image : docs/images/4-interface-segregation.webp
 *
 */

interface Robot {
    void spin();
    void rotateArms();
    void wiggleAntennas();
}




class BasicRobot implements Robot {

    public void spin() {
        System.out.println("Spinning...");
    }

    public void rotateArms() {
        System.out.println("Rotating arms...");
    }

    public void wiggleAntennas() {
        // ❌ This robot doesn't have antennas
        throw new UnsupportedOperationException("No antennas!");
    }
}


/**
 *
 * bad :-
 *
 * interface Notification {
 *     sendEmail();
 *     sendSMS();
 *     sendPush();
 * }
 *
 *
 * good :-
 * interface EmailSender {}
 * interface SmsSender {}
 * interface PushSender {}
 */