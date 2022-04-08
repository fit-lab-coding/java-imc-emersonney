package fit;

public class CalculadoraImc {

    public static double calcular(double altura, double peso) {
        return peso / Math.pow(altura, 2);
    }

    public static String obterIndice(double altura, double peso) {
        double indice = calcular(altura, peso);

        if (indice < 18.5) return "Magreza";
        if (indice < 24.9) return "Normal";
        if (indice < 30.0) return "Sobrepeso";
        return "Obesidade";
    }
}
