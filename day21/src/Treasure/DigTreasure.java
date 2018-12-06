package Treasure;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class DigTreasure {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, InvocationTargetException {
        byte[] bytes = Files.readAllBytes(Paths.get("d:\\IdeaProjects\\homework\\day21\\src\\Treasure\\Treasure.class"));
        ClassLoader cl = new ClassLoader() {
            @Override
            protected Class<?> findClass(String name) throws ClassNotFoundException {
                return super.defineClass(name, bytes, 0, bytes.length);
            }
        };
        Class<?> clazz = cl.loadClass("com.westos.Treasure");
        Constructor<?> cons = clazz.getDeclaredConstructor();
        cons.setAccessible(true);
        Object obj = cons.newInstance();
        Arrays.stream(clazz.getMethods()).filter(m -> m.getAnnotations().length > 0).findFirst().ifPresent((method) -> {
            try {
                method.invoke(obj);
            } catch (Exception e) {
                e.printStackTrace();
            }}
        );
    }
}

