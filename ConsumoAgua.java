
package consumoagua;

public class ConsumoAgua {
    
    public static void consumoCasa(int[][] consumoAgua) {
        for (int i = 0; i < consumoAgua.length; i++) {
            int sumaCA = 0;
            for (int j = 0; j < consumoAgua[i].length; j++) {
                sumaCA += consumoAgua[i][j];
            }
            System.out.println("El consumo de agua a la semana de la casa " + (i + 1) + " es de: " + sumaCA);
        }
    }
    
    public static void consumoDia(int[][] consumoAgua){
        for (int j = 0; j < consumoAgua[0].length; j++) {
            int sumaCADia = 0;
            for (int i = 0; i < consumoAgua.length; i++) {
                sumaCADia += consumoAgua[i][j];
            }
            System.out.println("El consumo de agua por dia " + (j + 1) + " es de: " + sumaCADia);
        }
    }
    
    public static void main(String[] args){
        int[][] consumoAgua = {
            {100, 50, 30, 120, 60},
            {32, 122, 46, 80, 90},
            {45, 100, 56, 26, 36},
            {60, 110, 72, 33, 40}
        };
        ConsumoAgua.consumoCasa(consumoAgua);
        ConsumoAgua.consumoDia(consumoAgua);
    }
}
