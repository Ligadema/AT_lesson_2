
import java.net.SocketOption;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Mark", "", "male", 21, "marketing");
        System.out.println(student.profile());

        student.setRating(10, 7, 7);
        System.out.println("Средний балл: " + student.rating());


      /*  Methods methods = new Methods();
        boolean x = methods.x;
        boolean y = methods.y;
            System.out.println("Является ли переменная а четной - " + x +  '\n' + "Является ли переменная b четной - " + y);
        int squareA = methods.squareA;
        int squareB = methods.squareB;
        int cubeA = methods.cubeA;
        int cubeB = methods.cubeB;
            System.out.println("Переменная а в квадрате - " + squareA + '\n' + "Переменная b в квадрате - " + squareB);
            System.out.println("Переменная а в кубе - " + cubeA + '\n' + "Переменная b в кубе - " + cubeB);
       */
    }
    }

