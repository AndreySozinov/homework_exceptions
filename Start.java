package homework_exceptions;

public class Start {
    public String start() {
        InputData user = new InputData();
        user.inputData();

        ParseData parse = new ParseData();
        if (parse.parseData(user.getUserData()) == 1) {
            return "Введено неверное количество данных";
        } else {
            FileRecord record = new FileRecord();
            record.fileRecord();

        return "Запись пользователя произведена корректно";
        }
    }
}
