import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersion en java, los saluda Yamil");
        //System.out.println("Pelicula Matrix");


        //declaracion de variables
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor pelicula del fin del milenio
                """;
        double mediaEvaluacionUsuario = 0;
        System.out.println("Pelicula: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Calificacion" + evaluacion);
        System.out.println("Esta incluida en el plan basico?: " + incluidoEnElPlanBasico);
        System.out.println("Sinopsis: " + sinopsis);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;

        System.out.println("Media de la calificacion de Matrix: " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023) {
            System.out.println("Pelicula popular del momento");
        } else {
            System.out.println("Pelicula retro recomendada");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la calificacion que le darias a Matrix: ");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }

        System.out.println("La media de la pelicula " +
                "Matrix calculada por los usuarios es: " + mediaEvaluacionUsuario / 3);
    }
}