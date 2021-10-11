public class Tree {
    int size;

    public Tree() {
        this.size = 3;
    }

    public Tree(int size) {
        this.size = size;
    }

    void show() {
        int row = size;
        for (int y = 0; y < row; y++) {
            int rowNo = y + 1;
            System.out.print(rowNo + ": ");
            for (int i = row; i > y; i--) {
                System.out.print(" ");
            }
            int g = 2 * y + 1;
            for (int stars = 0; stars < g; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
