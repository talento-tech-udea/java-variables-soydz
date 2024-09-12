import org.talento.tech.*;

import java.util.List;

/**
 * Este codigo permite calcular el perimetro de figuras de N >= 3 lados
 * Figuras de ejemplo:
 * - square.txt - lado de 4
 * - triangle.txt - base de 4, altura de 4
 */

public class PerimeterCalculator {

    public PerimeterCalculator () {}

    public double calculatePerimeter(Shape s) {
        // Definir la variable que acumule el perimetro
        double perimeter = 0;

        List<Point> points = s.getPoints();
        Point prevPoint = points.getLast();

        for (Point point : points) {
            // Obtener la distancia de los lados
            // Ayuda: prevPoint.distancia(point)
            double distance = prevPoint.distance(point);
            perimeter += distance;

            prevPoint = point;
        }

        // Retornar la variable del perimetro
        return perimeter;
    }

    public int getTotalPoints(Shape s) {
        // Definir la variable para el total de puntos
        int points = 0;
        for(Point point: s.getPoints()) {
            // Acumular el total de puntos
            points ++;
        }

        // Retornas el valor de puntos
        return points;
    }

    public static void main (String[] args) {
        PerimeterCalculator perimeterCalculator = new PerimeterCalculator();
        // Definit el nombre del archivo
        String fileName = "square.txt";
        Shape shape = new Shape();

        shape.readPoints(fileName);
        // Mostrar el valor de calculatePerimeter y getTotalPoints

    }
}
