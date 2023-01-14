package homework_exceptions;
/*
 * должен создаться файл с названием, 
равным фамилии, в него в одну строку должны записаться полученные данные, вида

<Фамилия><Имя><Отчество><датарождения><номертелефона><пол>

Однофамильцы должны записаться в один и тот же файл, в отдельные строки.

Не забудьте закрыть соединение с файлом.

При возникновении проблемы с чтением-записью в файл, исключение должно быть 
корректно обработано, пользователь должен увидеть стектрейс ошибки.
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileRecord {

    public void fileRecord() {
        StringBuilder line = new StringBuilder();
        line.append("<").append(ParseData.getLastName()).append(">");
        line.append("<").append(ParseData.getFirstName()).append(">");
        line.append("<").append(ParseData.getPatronymic()).append(">");
        line.append("<").append(ParseData.getBirthDate()).append(">");
        line.append("<").append(ParseData.getPhoneNumber()).append(">");
        line.append("<").append(ParseData.getGender()).append(">").append("\n");

        String result = line.toString();
        String filename = ParseData.getLastName() + ".txt";

        try (FileWriter writer = new FileWriter(filename, true)) {
            BufferedWriter bf = new BufferedWriter(writer);
            bf.write(result);
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
