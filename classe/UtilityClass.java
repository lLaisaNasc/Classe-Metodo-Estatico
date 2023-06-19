package classe;

public class UtilityClass {

    public static int valorEstático = 10;

    public static void methodA() {
        System.out.println("Método estático sendo chamado.");
    }

    public static void main(String[] args) {

        int valor = UtilityClass.valorEstático;

        UtilityClass.methodA();
    }
}
