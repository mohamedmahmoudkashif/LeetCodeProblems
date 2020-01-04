import java.util.Arrays;

public class _1029 {
    public static int twoCitySchedCost(int[][] costs) {

        //costs = new int[][]{{10, 20}, {30, 200}, {400, 50}, {30, 20}};

        System.out.println(costs[0][0]);
        Arrays.sort(costs);


        return 0;
    }

    public static void main(String[] args){
       int [][]costs = new int[][]{{10, 20}, {30, 200}, {400, 50}, {30, 20}};
        System.out.println(twoCitySchedCost(costs));
    }
}
