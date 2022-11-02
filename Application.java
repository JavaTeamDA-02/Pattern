package abstractFactory;

import java.util.Scanner;

public class Application {

    private static AbstractFactory af;

    public static void displayCircle(Circle circle) {
        System.out.println("ID: " + circle.getID());
        System.out.println("Color: " + circle.getColor());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Radius: " + circle.getRadius());
    }

    public static void displayTriangle(Triangle triangle){
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Side A: " + triangle.getA());
        System.out.println("Side B: " + triangle.getB());
        System.out.println("Side C: " + triangle.getC());
        System.out.println("Area: " + triangle.getSquare());
        System.out.println("Perimeter: " + triangle.getPerimetr());
    }

    public static void menu(){
        Scanner scan = new Scanner(System.in);
        int number = 0;
        if(af == null) {
            System.out.println ("Оберіть колір:");
            System.out.println ("1) Біле");
            System.out.println ("2) Чорне");
            number = scan.nextInt();

            switch (number) {
                case 1:
                    af = new AbstractFactory(new WhiteFactory());
                    break;
                case 2:
                default:
                    af = new AbstractFactory(new BlackFactory());
                    break;
            }
        }

        System.out.println ("Оберіть варіант:");
        System.out.println ("1)Трикутник");
        System.out.println ("2)Коло");
        System.out.println ("3)Трикутник з параметрами");
        System.out.println ("4)Коло з параметрами");
        number = scan.nextInt();
        switch (number) {
            case 1:
                Triangle triangle = af.getTriangle();
                if(triangle.ifTriangle()){
                    displayTriangle(triangle);
                }
                else{
                    System.out.println("Це не трикутник");
                }
                break;
            case 2:
                Circle circle = af.getCircle();
                displayCircle(circle);
                break;
            case 3:
                System.out.println("Введіть сторону А:");
                double a = scan.nextDouble();
                System.out.println("Введіть сторону Б:");
                double b = scan.nextDouble();
                System.out.println("Введіть сторону В:");
                double c = scan.nextDouble();
                Triangle triangleP = af.getTriangleCustom(a,b,c);
                if(triangleP.ifTriangle()){
                    displayTriangle(triangleP);
                }
                else{
                    System.out.println("Це не трикутник");
                }
                break;
            case 4:
                System.out.println("Введіть ID:");
                int id = scan.nextInt();
                System.out.println("Введіть радіус:");
                double r = scan.nextDouble();
                Circle circleP = af.getCircleCustom(id, r);
                displayCircle(circleP);
                break;
            default:
                System.out.println("Not right answer!");
                break;
        }
        System.out.println("Оберіть варіант:");
        System.out.println("1) Продовжити із обраним кольором");
        System.out.println("2) Змінити колір");
        System.out.println("0) Завершити роботу програми");
        number = scan.nextInt();

        switch (number) {
            case 1:
                menu();
                break;
            case 2:
                af = null;
                menu();
                break;
            default:
                System.out.println("OK!");
        }
    }

    public static void main(String [] arg){
        menu();
    }
}