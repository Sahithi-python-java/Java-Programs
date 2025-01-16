class MyArray{
    public static void main(String[] args) {
        //creating an array
        int ab[]=new int[5];

        //inserting elements into array
        ab[0]=10;
        ab[1]=20;
        ab[2]=30;
        ab[3]=40;
        ab[4]=50;

        //or

        int bc[] = {60,70,80,90,100};

        System.out.println("Index of ab: "+ab[2]);

        System.out.println("Index of bc: "+bc[2]);

    }
}