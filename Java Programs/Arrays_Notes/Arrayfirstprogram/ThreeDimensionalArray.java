public class ThreeDimensionalArray {
    public static void main(String[] args) {

        //marks[][][]===> 1st [] is for "no.of 2Dimensions" and 2nd if for rows and 3rd[] is for columns
        int collegemarks[][][]={ {{10,9,8,7,6},{10,8,9,7,6},{10,9,8,7,5}},
                                {{10,9,8,7,6},{10,8,9,7,6},{10,9,8,7,5}},
                                {{10,9,8,7,6},{10,8,9,7,6},{10,9,8,7,5}}

                                };
        
        for(int i=0; i<3;i++){//no.of 2D
            for(int j=0;j<3;j++){//no.of rows
                for(int k=0;k<5;k++){//no.of columns
                    System.out.println(collegemarks[i][j][k]+"\t");
                }
            }
        }

    System.out.println();
    }
}