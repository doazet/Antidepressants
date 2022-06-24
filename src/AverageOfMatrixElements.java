public class AverageOfMatrixElements {
    /**
     * Вычислить среднее арифметическое значение элементов матрицы W(L,L), расположенных слева и справа от двух диагоналей. (Задание для 1сников)
     **/
    public static void getAverageOfMatrixElements(int[][] matrix) {
        double sum = 0;
        double count = 0;
        int size =  matrix.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i > j && i + j < size - 1) || (i < j && i + j > size - 1)) {
                    sum += matrix[i][j];
                    count++;
                }
            }

        }
        if (count != 0) {
            System.out.println(sum/count);
        }

    }
}