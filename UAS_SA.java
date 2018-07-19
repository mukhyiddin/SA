public class UAS_SA { 

boolean solveMaze(int maze[][])
{
    int sol[][] = {{0, 0, 0, 0},
        {0, 0, 0, 0},
        {0, 0, 0, 0},
        {0, 0, 0, 0}
    };

    if (solveMazeUtil(maze, 0, 0, sol) == false)
    {
        System.out.print("Solution doesn't exist");
        return false;
    }

    printSolution(sol);
    return true;
}
boolean solveMazeUtil(int maze[][], int x, int y, int sol[][])
 {      
        if (x == N - 1 && y == N - 1)
        {
            sol[x][y] = 1;
            return true;
        }
        if (isSafe(maze, x, y) == true)
        {
            sol[x][y] = 1;
            if (solveMazeUtil(maze, x + 1, y, sol))
                return true;
            if (solveMazeUtil(maze, x, y + 1, sol))
                return true;
            sol[x][y] = 0;
            return false;
        }
        return false;
    }                         
    public static void main(String args[])
    {
        SA_UAS rat = new SA_UAS();
        int maze[][] = {
            {1, 0, 0, 0},
            {1, 1, 1, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        rat.solveMaze(maze);
    }
}
