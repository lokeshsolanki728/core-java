package objectWithoutNewKeywords;
public class Example {
    public void display() {
        System.out.println("Object created using Class.forName() and newInstance()");
    }

    
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("Example");
            Example example = (Example) clazz.getDeclaredConstructor().newInstance();
            example.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}