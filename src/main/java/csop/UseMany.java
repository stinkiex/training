package csop;

public class UseMany {
    public static void main(String[] args) {
        System.out.println("Количество аргументов: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i] + " ");
        }
    }
}
