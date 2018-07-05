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

boolean solveMazeUtil(int maze[][], int x, int y,
                      int sol[][])
{ }                      

    
    public static void main(String args[])
    {}
}
