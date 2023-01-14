package homework_exceptions;
/*
 * Приложение должно проверить введенные данные по количеству. 
Если количество не совпадает с требуемым, вернуть код ошибки, обработать его 
и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.

Приложение должно попытаться распарсить полученные значения и выделить из них 
требуемые параметры. Если форматы данных не совпадают, нужно бросить исключение, 
соответствующее типу проблемы. Можно использовать встроенные типы java 
и создать свои. Исключение должно быть корректно обработано, пользователю выведено 
сообщение с информацией, что именно неверно.
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class ParseData {
    private String[] dataSet;
    private static String lastName;
    private static String firstName;
    private static String patronymic;
    private static LocalDate birthDate;
    private static long phoneNumber;
    private static char gender;

    public int parseData(String data) {
        this.dataSet = data.split(" ");
        if (dataSet.length < 6) {
            return 1;
        }
        if (dataSet.length > 6) {
            return 2;
        }
        else {
            try {
                lastName = dataSet[0];
            } catch (RuntimeException e) {
                System.out.println("Неверный формат фамилии"); 
            }
            try {
                firstName = dataSet[1];
            } catch (RuntimeException e) {
                System.out.println("Неверный формат имени");
            }
            try {
                patronymic = dataSet[2];
            } catch (RuntimeException e) {
                System.out.println("Неверный формат отчества");
            }
            try {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.ENGLISH);
                birthDate = LocalDate.parse(dataSet[3], dtf);
            } catch (RuntimeException e) {
                System.out.println("Неверный формат дня рождения");
            }
            try {
                phoneNumber = Long.parseLong(dataSet[4]);
            } catch (RuntimeException e) {
                System.out.println("Неверный формат номера телефона");
            }
            try {
                gender = dataSet[5].charAt(0);
            } catch (RuntimeException e) {
                System.out.println("Неверный формат символа пола");
            }
        }
        return 0;
    }

    public static String getLastName() {
        return lastName;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static String getPatronymic() {
        return patronymic;
    }

    public static LocalDate getBirthDate() {
        return birthDate;
    }

    public static long getPhoneNumber() {
        return phoneNumber;
    }

    public static char getGender() {
        return gender;
    }
}
