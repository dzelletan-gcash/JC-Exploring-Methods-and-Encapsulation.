package org.example;

public class SmartDoor {
    private boolean isLocked;

    public void lockDoor() {
        isLocked = true;
    }

    public void unlockDoor() {
        isLocked = false;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public static void main(String[] args) {
        SmartDoor sd = new SmartDoor();
        System.out.println("Is the door locked? " + sd.isLocked);
        sd.lockDoor();
        System.out.println("Is the door locked? " + sd.isLocked);
        sd.unlockDoor();
        System.out.println("Is the door locked? " + sd.isLocked);
    }
}
