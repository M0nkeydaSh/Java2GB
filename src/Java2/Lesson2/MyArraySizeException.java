package Java2Lesson2;

public class MyArraySizeException extends RuntimeException{

    public MyArraySizeException(){
        super("Подан массив другого размера");
    }
}
