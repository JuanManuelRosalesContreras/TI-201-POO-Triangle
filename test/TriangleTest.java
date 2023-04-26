public class TriangleTest {
    public static void main(String [] args){
      Triangle a = new Triangle();
        
        a.setBase(10);
        a.setHeight(13);
        a.computeArea();
        
        System.out.println("Triangulo 1----------");
        System.out.println("Base: " + a.getBase() );
        System.out.println("Altura: " + a.getHeight() );
        System.out.println("Area: " + a.getArea() ); 
        
        //Falla y correccion
        a.setBase(12);
        
        System.out.println("\nTriangulo 2----------");
        System.out.println("Base: " + a.getBase() );
        System.out.println("Altura " + a.getHeight() );
        //a.computerArea();
        System.out.println("Area: " + a.getArea() ); 
       
    }
}

