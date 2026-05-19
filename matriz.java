public class matriz {
    public static void main(String[] args) {
        int[][] volante = new int[6][10];
        int num = 1;


        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                volante[i][j] = num;
                num++;
            }
        }
        for (int i = 0; i < 6; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.printf("[%02d]", volante[i][j]);
            }
            System.out.println();
        }
    }
}

