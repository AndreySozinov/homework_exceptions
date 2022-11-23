package homework_exceptions;
/*
 * должен создаться файл с названием, 
равным фамилии, в него в одну строку должны записаться полученные данные, вида

<Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>

Однофамильцы должны записаться в один и тот же файл, в отдельные строки.

Не забудьте закрыть соединение с файлом.

При возникновении проблемы с чтением-записью в файл, исключение должно быть 
корректно обработано, пользователь должен увидеть стектрейс ошибки.
 */
import java.io.FileWriter;
import java.io.IOException;

public class FileRecord {
    private static StringBuilder line;
    private static String result;

    public void fileRecord() {
        System.out.println(line);
        line.append("<" + ParseData.getLastName() + ">");
        System.out.println(line);
        line.append("<" + ParseData.getFirstName() + ">");
        line.append("<" + ParseData.getPatronym() + ">");
        line.append("<" + ParseData.getBirthDate() + ">");
        line.append("<" + ParseData.getPhoneMumber() + ">");
        line.append("<" + ParseData.getGender() + ">");

        result = line.toString();

        try (FileWriter writer = new FileWriter(ParseData.getLastName())) {
            writer.write(result);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
}
