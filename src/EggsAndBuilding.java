public class EggsAndBuilding {
    /**Дано 100-этажное здание. Если яйцо сбросить с высоты N-го этажа (или с большей высоты), оно разобьется.
     * Если его бросить с любого меньшего этажа, оно не разобьется. У вас есть 3 яйца. Найдите N за минимальное количество бросков**/
    public static int getMinThrows(int eggsAmount, int floors){
        int[][] counting = new int[eggsAmount][floors + 1];
        for (int i = 1; i <= floors; i++)
        {
            counting[0][i] = i;
        }
        for (int egg = 1; egg < eggsAmount; egg++)
        {
            for (int maxFloor = 3; maxFloor <= floors; maxFloor++)
            {
                int minFloor = floors;
                for (int currentFloor = 1; currentFloor <= maxFloor; currentFloor++)
                {
                    int worstFloorIfBroken = counting[egg - 1][currentFloor - 1];
                    int worstFloorIfSaved = counting[egg][maxFloor - currentFloor];
                    int optimalFloor = Math.max(worstFloorIfBroken, worstFloorIfSaved);
                    if (optimalFloor < minFloor)
                    {
                        minFloor = optimalFloor;
                    }
                }
                counting[egg][maxFloor] = minFloor + 1;
            }
        }
        return counting[eggsAmount - 1][floors];
    }

}
