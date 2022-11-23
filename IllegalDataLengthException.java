package homework_exceptions;

public class IllegalDataLengthException extends Exception{
    public IllegalDataLengthException() {
        super("Введено неверное количество данных");
    }
}
