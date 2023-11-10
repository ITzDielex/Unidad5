package practica3u4u5;

public class Practica3U4U5 {

    public static void promedioEstudiante(double[][] calificaciones) {
        for (int i = 0; i < calificaciones.length; i++) {//Calificaciones
            double sumaCalf = 0;
            for (int j = 0; j < calificaciones[i].length; j++) {//Suma de calificaciones
                sumaCalf += calificaciones[i][j];
            }
            double promedioEstudiante = sumaCalf / calificaciones[i].length;
            System.out.println("El promedio del estudiante " + (i + 1) + " es de: " + promedioEstudiante);
        }
    }
public static void promedioMateria(double[][] calificaciones) {
    for (int j = 0; j < calificaciones[0].length; j++) {
        double sumaCalfM = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            sumaCalfM += calificaciones[i][j];
        }
        double promedioMateria = sumaCalfM / calificaciones.length;
        System.out.println("El promedio de la materia " + (j + 1) + " es de: " + promedioMateria);
    }
}
    public static void main(String[] args) {
        double[][] calificaciones = {
            {90.5, 85.0, 78.5, 92.0},
            {88.0, 76.5, 89.0, 94.5},
            {70.0, 82.5, 91.0, 87.5}
        };
        Practica3U4U5.promedioEstudiante(calificaciones);
        Practica3U4U5.promedioMateria(calificaciones);

    }

}