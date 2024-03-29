package lesson5;

public class Lection {
    // создание зависимостей -- идем в файл pom.xml -- создаем блок <dependencies></<dependencies>
    // в конце файла и туда пишем код

    // mvn json в гугл -- куча библиотек, которые могут пригодиться (mvnrepository)
    // возьмем JSON.simple последнюю версию, берем код для Maven и вставляем в созданнный блок

    // как "подключить" зависимость после того, как записали ее в блок dependencies:
    // слева нажимаем двумя пальцами по тачпаду на pom.xml, далее выбираем Maven -> Reload project

    // Map<String, Integer> map = new HashMap<>(); -- создание словаря
    // нельзя использовать int, так как принимает только ссылочные типы данных

    // для того чтобы передать json объект, используя то, что мы подключили
    // в pom.xml, разбираемся со словарями, так как json-у нужно передать Map

    // отличие Array от List
    // Array -- реализация List
    // если хочешь работать конкретно с листом -- необходимо создать класс, который будет "implements List",
    // в нем необходимо реализовать все методы, что есть у List (можно сделать одним нажатием как-то)

    // так же есть LinkedList и ArrayList
    // ArrayList -- обращение к элементу по его индексу
    // LinkedList -- до элемента нужно "дойти"

    // Arrays.asList(1, 2, 3) -- создание списка с помощью библиотеки Arrays


    // ФУНКЦИОНАЛЬНОЕ ПРОГРАММИРОВАНИЕ

    // integerList.stream() -- преобразование объекта в stream
    // integerList.stream().forEach() -- выполннеие каких-либо действий с каждым элементом массива
    // однако теперь в java можно и так: integerList.forEach()
    }

