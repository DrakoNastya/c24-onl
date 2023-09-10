package Lesson11;

public class Main {
    //Задача 1:
    //Создать класс, в котором будет статический метод. Этот метод принимает на вход три
    //параметра: login, password, confirmPassword. Все поля имеют тип данных String. Длина
    //login должна быть меньше 20 символов и не должен содержать пробелы. Если login не
    //соответствует этим требованиям, необходимо выбросить WrongLoginException. Длина
    //password должна быть меньше 20 символов, не должен содержать пробелом и должен
    //содержать хотя бы одну цифру. Также password и confirmPassword должны быть равны.
    //Если password не соответствует этим требованиям, необходимо выбросить
    //WrongPasswordException. WrongPasswordException и WrongLoginException -
    //пользовательские классы исключения с двумя конструкторами – один по умолчанию,
    //второй принимает сообщение исключения и передает его в конструктор класса Exception.
    //Метод возвращает true, если значения верны, false в противном случае.
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {


        try {
            CheckInformation.checkUsersInformation("dbsfbj", "ggg6g", "ggg6g");
            System.out.println("All information is entered correctly");
        } catch (WrongLoginException exception) {
            System.out.println("Something went wrong, check the information you entered");
        } catch (WrongPasswordException exception) {
            System.out.println("Something went wrong, check the information you entered. " + exception.getMessage());
        }
    }

}

