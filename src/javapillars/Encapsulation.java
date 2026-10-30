
package javapillars;

public class Encapsulation {

    static class Student {
        private int age;
        private String name;

        // Setter methods
        public void setAge(int a) {
            age = a;
        }

        public void setName(String n) {
            name = n;
        }

        // Getter methods
        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {

        Student s = new Student();

        s.setAge(20);
        s.setName("Rasshi");

        System.out.println(s.getAge());
        System.out.println(s.getName());
    }
}


