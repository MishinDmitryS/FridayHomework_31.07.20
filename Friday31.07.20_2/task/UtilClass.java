package com.js.generics.homework.task;

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
    public static boolean isBlank(List list) {
        return false;
    }

    /**
     * Получает последний элемент в коллекции
     * Если список равен null, то выбрасывается исключение IllegalArgumentException
     *
     * @param list список
     * @return последний элемент в коллекции
     */
    public static Object getLastElem(List list) {
        return null;
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
    public static Object findElem(List list, Object elem) {
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
    public static List union(List list1, List list2) {
        return null;
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
    public static List removeAll(List list1, List list2) {
        return null;
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
        return 0;
    }
}
