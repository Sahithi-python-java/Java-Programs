public class TwoDimensionalArray {
    public static void main(String[] args) {

        //marks[][]===> 1st brackets is for rows and 2nd if for columns
        int marks[][]={{10,9,8,7,6},{10,8,9,7,6},{10,9,8,7,5}};

        for(int i=0;i<3;i++)//rows
        {
            for(int j=0;j<5;j++)//columns
            {
                System.out.print(marks[i][j]+"\t "); 
            }
        }
        System.out.println();
    }
    
}
