package abstractFactory;

import java.util.Scanner;

public class Application {
    private AbstractFactory af;

    public void newBlackCircle(){
        af = new AbstractFactory();
        BaseFactory bf = af.getFactoryBlack();
        Circle first = bf.createCircle();
        System.out.println("Колір: "+ first.getColor());
        System.out.println("ID: "+first.getID());
        System.out.println("Площа: "+first.getArea());
        System.out.println("Периметр: "+first.getPerimeter());
        System.out.println("Радіус: "+first.getRadius());
        }
    public void newWhiteCircle(){
        af = new AbstractFactory();
        BaseFactory bf = af.getFactoryWhite();
        Circle first = bf.createCircle();
        System.out.println ("Колір: " +first.getColor());
        System.out.println("ID: " + first.getID());
        System.out.println("Площа: "+first.getArea());
        System.out.println("Периметр: "+first.getPerimeter());
        System.out.println("Радіус: "+first.getRadius());
    }
    public void newBlackTriangle(){
        af = new AbstractFactory();
        BaseFactory bf = af.getFactoryBlack();
        Triangle first = bf.createTriangle();
        System.out.println("Колір: " + first.getColor());
        System.out.println("Чи трикутник: " +first.ifTriangle());
        System.out.println("Периметр: " +first.getPerimetr());
        System.out.println("Площа: " +first.getSquare());
    }
    public void newWhiteTriangle(){
        af = new AbstractFactory();
        BaseFactory bf = af.getFactoryWhite();
        Triangle first = bf.createTriangle();
        System.out.println("Площа: " + first.getColor());
        System.out.println("Чи трикутник: " +first.ifTriangle());
        System.out.println("Периметр: " +first.getPerimetr());
        System.out.println("Площа: " +first.getSquare());
    }
    public static void main(String [] arg){
        Application ap = new Application();
        System.out.println ("Оберіть варіант:");
        System.out.println ("1)Трикутник");
        System.out.println ("2)Коло");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number == 1){
            System.out.println ("Оберіть колір:");
            System.out.println ("1) Білий");
            System.out.println ("2) Чорний");
            Scanner scan3 = new Scanner(System.in);
            int number2 = scan3.nextInt();

            if (number2 == 1){
                ap.newWhiteTriangle();
            }
            if (number2 == 2){
                ap.newBlackTriangle();
            }
        }

        if (number == 2){
            System.out.println ("Оберіть колір:");
            System.out.println ("1) Біле");
            System.out.println ("2) Чорне");
            Scanner scan3 = new Scanner(System.in);

            int number2 = scan3.nextInt();

            if (number2 == 1){
                ap.newWhiteCircle();
            }
            if (number2 == 2){
                ap.newBlackCircle();
            }
        }
    }
}

