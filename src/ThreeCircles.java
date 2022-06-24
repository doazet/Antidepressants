public class ThreeCircles {
    /**Вывести в консоль три вложенных окружности произвольно радиуса**/
    public static void printCircles(int size) {
        double circle1, circle2, circle3, radius, center;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                radius = (double)(size - 1)/2;
                center = Math.pow(i - radius, 2) + Math.pow(j - radius, 2);
                circle1 = center - Math.pow(radius, 2);
                circle2 = center - Math.pow(2*radius/3, 2);
                circle3 = center - Math.pow(radius/3, 2);
                if ((circle1 <= (double)size && circle1 >= 0) || (circle2 <= (double)size*2/3 && circle2 >= 0) || (circle3 <= (double)size/3 && circle3 >= 0)) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
