package company.task;

import java.util.ArrayList;
import java.util.List;

/**
 * Сделайте методы типизированными (Используйте generics)
 */
public class UtilClass {
    /**
     * Возвращает true, если список равен null или если список пуст
     *
     * @param list список.
     * @return true, если список равен null или если список пуст
     */
    public static <T> boolean isBlank(List<T> list) {
        if(list == null){
            return true;
        }

        if(list.size() == 0){
            return true;
        }

        return false;
    }

    /**
     * Получает последний элемент в коллекции
     * Если список равен null, то выбрасывается исключение IllegalArgumentException
     *
     * @param list список
     * @return последний элемент в коллекции
     */
    public static  <T> T getLastElem(List<T> list) {
        if(list == null){
            return null;
        } else if(list.size() == 0){
            return null;
        } else {
            return (T)list.get(list.size()-1);
        }

    }

    /**
     * Получает элемент из списка.
     * Если в аргументах список или элемент равен null, то выбрасывается исключение IllegalArgumentException
     * Если элемент не найден, то возвращаем null
     *
     * @param list список, в котором ищем элемент
     * @param elem элемент, который ищется в списке.
     * @return элемент из списка.
     */
    public static <T> T findElem(List<T> list, T elem) {
        if(list == null){
            throw new IllegalArgumentException();
        } else {
            for(T etem: list){
                if(etem == elem){
                    return elem;
                }
            }
        }

        return null;
    }

    /**
     * Объединяет два списка.
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы метода не меняются
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return возвращает объединенный список.
     */
    public static <T> List<T> union(List<T> list1, List<T> list2) {
        List<T> list = new ArrayList<T>();
        for(T etem: list){
            list.add(etem);
        }
        if(list1 == null || list2 == null){
            return null;
        } else {
            list.addAll(list1);
            list.addAll(list2);
            return list;
        }
        //return null;
    }

    /**
     * Удаляет все элементы из списка list1 всех элементов, которые встречаются в списке list2
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы метода не меняются
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return возвращает список, который содержит элементы из списка list1, в котором удалены все элементы из
     * списка list2.
     */
    public static <T> List<T> removeAll(List<T> list1, List<T> list2) {
        List<T> list = new ArrayList<T>();
        for(T etem: list){
            list.add(etem);
        }

        for(T etem: list1){
            int proverka = 0;
            for(T etem2: list2){
                if(etem == etem2){
                    proverka = 1;
                    break;
                };

            }
            if(proverka==0)
                list.add(etem);
        }
        return list;
    }

    /**
     * Складывает числа из обоих списков и возвращает сумму.
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы метода не меняются
     * Подсказка:
     * 1) Помните, что все объекты чисел (Integer, Double, Float и т.д) наследуются от общего предка Number.
     * 2) Используйте ограничения для типизации, чтобы списки могли содержать любые числа (Integer, Double, Float и т.д)
     * 3) Для приведения Number к double воспользуйтесь num.doubleValue();
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return сумма чисел.
     */
    public static double sum(List<? extends Number> list1, List<? extends Number> list2) {
        double otvet = 0;
        if(list1 == null || list2 == null) {
            throw new IllegalArgumentException();
        }
        for(Number etem: list1){
            otvet += etem.doubleValue();
        }
        for(Number etem2: list2){
            otvet += etem2.doubleValue();
        }
        return otvet;
    }
}