package JavaAbstraction;

public class Abstract {
    public static void main(String[] args) {
        Shape r = new Rectangle();
        r.draw();
        Shape c =new Circle();
        c.draw();

    }

}
 abstract class  Shape{
    abstract void  draw();
 }

 class  Rectangle extends Shape {
     void draw() {
         System.out.println("drawing a rectangle");
     }
 }
class Circle extends  Shape{
        void draw (){
            System.out.println(" drawinig a circle");
        }
}
