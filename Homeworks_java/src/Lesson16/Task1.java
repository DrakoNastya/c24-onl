package Lesson16;


import java.util.Arrays;
import java.util.List;
public class Task1 {
    //Задача 1:
    //Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
    //Stream'ов:
    //- Удалить дубликаты
    //- Оставить только четные элементы
    //- Вывести сумму оставшихся элементов в стриме
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 4, -6, 4, 5, 7, 8);
        list.stream()
                .distinct()
                .filter(x -> x % 2 == 0)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
    }
}
