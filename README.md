Задание:

Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.

-Создать множество ноутбуков.
-Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
Например:
Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
-Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
-Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

Решение:

1. Создание файла LaptopFilter:
1.1 создание множества ноутбуков,
1.2 ввод хранения доступных критериев,
1.3 хранение параметров фильтрации,
1.4 вывод доступных критериев,
1.5 при продолжении ввода данных, запрос на продолжение ввода критериев,
1.6 фильтрация ноутбуков по введеным критериям

2. Создание файла Laptop:
2.1 Создание класса Laptop (переменные: model, ram, hdd, os, color)
2.2 Ввод конструктора класса Laptop
2.3 Геттеры и Сеттеры
2.4 Метод вывода информации о ноутбуке 
