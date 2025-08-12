package org.example;

public class SmartDoor {
    private boolean isLocked;

    public void lockDoor() {
        isLocked = true;
        System.out.println("Locking the door...");
    }

    public void unlockDoor() {
        isLocked = false;
        System.out.println("Unlocking the door...");
    }

    public boolean isLocked() {
        return isLocked;
    }

    public static void main(String[] args) {
        SmartDoor door = new SmartDoor();
        System.out.println("Is the door locked? " + door.isLocked);
        door.lockDoor();
        System.out.println("Is the door locked? " + door.isLocked);
        door.unlockDoor();
        System.out.println("Is the door locked? " + door.isLocked);
    }
}
