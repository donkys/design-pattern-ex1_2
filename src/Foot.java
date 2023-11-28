import java.awt.*;
import java.util.Scanner;

public class Foot {
    /*
        ! ตาม Requirement.
        # ส่งพารามิเตอร์ไปที่เมท็อด draw เป็นรูปที่ต้องการ (Ellipse หรือ Rectangle)
    */

    //Aggregation
    private FootShape shape;
    public Foot(FootShape shape) {
        this.shape = shape;
    }

    public Foot() {
        this.shape = new FootShape();
    }

    public void draw(String shapeType) {
        switch (shapeType.toLowerCase()) {
            case "ellipse" -> shape.drawAsEllipse().draw();
            case "rectangle" -> shape.drawAsRectangle().draw();
            default -> System.out.println("Invalid Shape Type");
        }
    }

    /*
        # สามารถทำ main() ใน class Foot ได้
    */
    //        private static FootShape shape;
    //        public static void main(String[] args) {
    //            shape = new FootShape();
    //            Scanner scanner = new Scanner(System.in);
    //            System.out.print("What to draw? 1. Ellipse, 2. Rectangle ");
    //            int choice = scanner.nextInt();
    //
    //            switch(choice) {
    //                case 1:
    //                    shape.drawAsEllipse().draw();
    //                    break;
    //                case 2:
    //                    shape.drawAsRectangle().draw();
    //                    break;
    //                default:
    //                    System.out.println("Invalid Shape Type");
    //            }
    //
    //            scanner.close();
    //        }

}