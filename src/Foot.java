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

    public void draw(String shapeType) {
        switch (shapeType.toLowerCase()) {
            // switch case with Arrow
            case "ellipse" -> new FootShape().drawAsEllipse();
            case "rectangle" -> new FootShape().drawAsRectangle();
            default -> System.out.println("Invalid Shape Type");
        }
    }

    /*
        # สามารถทำ main() ใน class Foot ได้
    */

    //    public static void main(String[] args) {
    //        Scanner scanner = new Scanner(System.in);
    //        System.out.print("What to draw? 1. Ellipse, 2. Rectangle ");
    //        int choice = scanner.nextInt();
    //
    //        switch(choice) {
    //            case 1:
    //                new FootShape().drawAsEllipse();
    //                break;
    //            case 2:
    //                new FootShape().drawAsRectangle();
    //                break;
    //            default:
    //                System.out.println("Invalid Shape Type");
    //        }
    //
    //        scanner.close();
    //    }

}