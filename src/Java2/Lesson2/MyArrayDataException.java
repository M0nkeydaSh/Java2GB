package Java2Lesson2;

public class MyArrayDataException extends RuntimeException{

    public MyArrayDataException(int col, int row){
        super(String.format("В ячейке %d %d лежит символ или текст вместо числа", col, row));
    }
}
