import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            ! ตาม Requirement.
            # ให้ใช้งาน class Foot ส่งอินสแตนซ์ของคลาส FootShape เข้าไปใน Constructor ของ Foot
            # มี main()ใน class Foot ที่ comment ไว้
        */
        FootShape shape = new FootShape();
        Foot foot = new Foot(shape);

        Scanner scanner = new Scanner(System.in);
        System.out.print("What to draw? 1. Ellipse, 2. Rectangle ");
        int choice = scanner.nextInt();

        switch (choice) {
            /*
                ! ตาม Requirement.
                # ส่งพารามิเตอร์ไปที่เมท็อด draw ของ class Foot เป็นรูปที่ต้องการ (Ellipse หรือ Rectangle)
            */
            case 1 -> foot.draw("Ellipse"); // switch case with Arrow
            case 2 -> foot.draw("Rectangle"); // switch case with Arrow
            default -> System.out.println("Invalid option"); // switch case with Arrow
        }

        scanner.close();
    }
}