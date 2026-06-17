class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initialColor = image[sr][sc];

        if (initialColor != color) 
            dfs(image, sr, sc, initialColor, color);

        return image;
    }

    private void dfs(int[][] image, int r, int c, int initialColor, int newColor) {

        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length)
            return;

        if (image[r][c] != initialColor)
            return;

        image[r][c] = newColor;

        dfs(image, r - 1, c, initialColor, newColor);
        dfs(image, r + 1, c, initialColor, newColor);
        dfs(image, r, c - 1, initialColor, newColor);
        dfs(image, r, c + 1, initialColor, newColor);
    }
}