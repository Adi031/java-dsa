package DSA.Recursion.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class mazeObstacles {
    public static void main(String[] args) {
        boolean [][] maze = {{true,true,true},{true,true,true},{true,true,true}};
//        pathObstacles("",0,0,maze);
//        pathObstaclesAll("",0,0,maze);
        int [][] path = new int[maze.length][maze[0].length];
        pathPrintAll("",0,0,maze,path,1);

    }

    static void pathObstacles(String p, int r, int c , boolean[][] maze){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return ;
        }
        if (!maze[r][c]){
            return;
        }
        if(r < maze.length-1){
            pathObstacles(p+"D",r+1,c,maze);
        }
        if(c < maze[0].length-1){
            pathObstacles(p+"R",r,c+1,maze);
        }
    }

//    All four directions included
    static void pathObstaclesAll(String p, int r, int c, boolean[][] maze){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return ;
        }
        if (!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        if(r < maze.length-1 ){
            pathObstaclesAll(p+"D",r+1,c,maze);
        }
        if(c < maze[0].length-1){
            pathObstaclesAll(p+"R",r,c+1,maze);
        }
        if(r > 0){
            pathObstaclesAll(p+"U",r-1,c,maze);
        }
        if(c > 0){
            pathObstaclesAll(p+"L",r,c-1,maze);
        }
        // this is the part where function is over so undo the changes made to array
        maze[r][c] = true;
    }

    static void pathPrintAll(String p, int r, int c, boolean[][] maze, int [][]path , int step){
        if(r == maze.length-1 && c == maze[0].length-1){
            path[r][c] = step;
            for(int[] arr : path ){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return ;
        }
        if (!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;
        if(r < maze.length-1 ){
            pathPrintAll(p+"D",r+1,c,maze,path,step+1);
        }
        if(c < maze[0].length-1){
            pathPrintAll(p+"R",r,c+1,maze,path,step+1);
        }
        if(r > 0){
            pathPrintAll(p+"U",r-1,c,maze,path,step+1);
        }
        if(c > 0){
            pathPrintAll(p+"L",r,c-1,maze,path,step+1);
        }
        // this is the part where function is over so undo the changes made to array
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
