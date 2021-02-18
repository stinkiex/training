public class FindFunction {

    public static void main(String[] args) {
        double z = resultat(Math.random()*1000+1000, Math.random()*1000+1000,  Math.random()*1000+1000);
        System.out.println(z);
    }

    public static double resultat(double a, double b, double c){
        double result = ((a - 3) * b / 2) + c;
        return result;
    }
}