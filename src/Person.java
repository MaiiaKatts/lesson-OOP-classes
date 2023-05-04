public class Person {
    String name;//это поля
    int age;//не просто переменная

    String auto;

    Person(String name, int age) {
        this.name = name;//надо добавить пояснение что такое this.
        this.age = age;//ссылка на тот самый текущий объект, когда мы в main
        this.auto = "";
    }
    Person(String name, int age, String auto) {
        this.name = name;//надо добавить пояснение что такое this.
        this.age = age;//ссылка на тот самый текущий объект, когда мы в main
        this.auto = auto;
    }
    Person (){}//это конструктор без парраметров.
    // Его система генерирует по умолчанию автоматически.
    //он существует в программе пока я не создаю какой-либо свой конструктор


    //немного модифицируем наш метод toString:
    // 1. Ограничим вывод возраста только для лиц старше 18 лет - совершеннолетних
    // 2. Создаем в return -е тернарник
    public String toString(){
        return name + " (" +  ((age<18)? "несовершеннолетний/-ая" : age)  + "), " + auto;
    }

    public void sayHallo() {
        System.out.println( "Hallo. I am " + name);
    }
}
