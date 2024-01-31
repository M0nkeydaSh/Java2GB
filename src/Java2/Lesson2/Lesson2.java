package Java2Lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"3", "2", "1", "0"},
                {"4", "4", "4", "4"},
                {"2", "3", "4", "5"},
                {"66", "77", "88", "100"}
        };

        try{
        doArray(arr);
        } catch(MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        }
    }

    public static void doArray(String[][] arr) {
        int sum = 0;
        int row = arr.length;
        int col = arr[0].length;
        if (row != 4 | col != 4) {
            throw new MyArraySizeException();
        }
        System.out.println(row);
        System.out.println(col);

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    try {
                        sum += Integer.parseInt(arr[i][j]);
                    } catch (Exception e) {
                        throw new MyArrayDataException(i, j);
                    }
                }
            }


        System.out.println(sum);
    }
}
