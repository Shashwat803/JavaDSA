package Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] images = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] output = flipping(images);
        for (int[] i : output) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }

    public static int[][] flipping(int[][] images) {
        for (int[] row : images) {
            int left = 0;
            int right = row.length - 1;
            while (left <= right) {
                int temp = row[left];
                row[left] = row[right] ^ 1;
                row[right] = temp ^ 1;
                left++;
                right--;
            }
        }
        return images;
    }
}
