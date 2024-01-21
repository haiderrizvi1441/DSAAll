package Patterns;

public class HollowRectangle {
    static void fnc1(int rows, int cols, char x){
        // Rows
        for(int i=0;i<rows;i++){
            // Columns
            for(int j=0;j<cols;j++){
                if((i==0 || i ==(rows-1)) || (j==0 || j==(cols-1))){
                    System.out.print(x + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        fnc1(6,5,'t');
    }
}
