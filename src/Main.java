import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println("Hello World!");

        Object object = new TestClass("1", "2", "3");

        Class<?> clazz = object.getClass();
        System.out.println(clazz.getName());

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Invoke.class)) {
                Invoke annotation = method.getAnnotation(Invoke.class);
                boolean accessible = method.isAccessible();

                if (!accessible) {
                    method.setAccessible(true);
                }

                method.invoke(object);
                System.out.println(annotation.value());

                if (!accessible) {
                    method.setAccessible(false);
                }
            }

        }
    }

}
