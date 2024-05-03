// Write a java program, to find the shortest displacement..
package Strings;

public class shortestPath {
    // Function to find shortest path
    static float getShortestPath(String path) {
        int x = 0, y = 0;   // initial values of x and y

        for(int i=0; i<path.length(); i++) {
            char direction = path.charAt(i);

            // south
            if(direction == 'S') {
                y--;
            // north
            } else if(direction == 'N') {
                y++;
            // east
            } else if(direction == 'E') {
                x++;
            // west
            } else {
                x--;
            }
        }

        int x2 = x * x;
        int y2 = y * y;

        return (float)Math.sqrt(x2 + y2);
    }
    // Main.java
    public static void main(String[] args) {
        String route = "NSSWENSSWENE";

        // Finction call
        System.out.println(getShortestPath(route));
    }
}