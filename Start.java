package homework_exceptions;

public class Start {
    public String start() {
        InputData user = new InputData();
        user.inputData();

        ParseData parse = new ParseData();
        try {
            parse.parseData(user.getUserData());
        } catch (IllegalDataLengthException e) {
            
        }

        FileRecord record = new FileRecord();
        record.fileRecord();

        return "Запись пользователя произведена корректно";
    }
}
