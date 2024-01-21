package Patterns;
class SolidRectange{
    // Take Rows, Columns, Char as input and print the solid rectange using the char
    static void fnc1(int rows, int cols, char x){
        // Rows
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(x + " ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args){

        fnc1(6,4,'o');

    }
}