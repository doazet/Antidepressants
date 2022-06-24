public class Main {
    public static  void main (String[] args){
        //паттерн 132
        int[] array = new int[]{1, 3, 4, 1};
        System.out.println(Pattern132.find132pattern(array));

        //среднее в матрице
        int[][] matrix = { { 3, 2, 1, 7 },
                { 9, 11, 5, 4 },
                { 6, 0, 13, 16 },
                { 7, 21, 14, 15 } };
        AverageOfMatrixElements.getAverageOfMatrixElements(matrix);

        //круги
        ThreeCircles.printCircles(30);

        //задачка с яйцами
        System.out.println(EggsAndBuilding.getMinThrows(3, 100));
    }
}
