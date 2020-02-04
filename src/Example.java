public class Example {
        public static void main(String[] args) {

            Student student = new Student("Mark", "", "male", 21, "marketing");
            System.out.println(student.profile());

            student.setRating(10, 7, 7);
            System.out.println("Средний балл: " + student.rating());

        }
    }
