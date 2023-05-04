public class Main {
    public static void main(String[] args) {

        System.out.println("Object Oriented Programing");
        System.out.println("---------Classes-----------");

        Person jack = new Person("Jack",18);
        Person jane = new Person("Jane",34,"BMW");
        Person nick = new Person("Nick", 17);
        //Person noNamePerson  = new Person();//это бомж - о нем ничего не известно
        //работать с данной строкой невозможно

        System.out.println(jack);//обрати внимание на отображение возроста в консоли
        System.out.println(jane);
        System.out.println(nick);
        //System.out.println(noNamePerson);//null (0), null

        jane.sayHallo();

        System.out.println(jane.auto.length());
        System.out.println(jack.auto.length());
       // System.out.println(noNamePerson.auto.length());//любое действие,
        // которое я пытаюсь выполнить с null - вызывает exception

        Account account = new Account (jack, "DE1234567890", 10_000);
        System.out.println(account);

        //account.balance = -10;

        System.out.println(account.getBalance());//исходный балланс - указан в строке 25

        account.setBalance (20_000);//измененный балланс и больше 0
        System.out.println(account);

        account.setBalance (-20_000);// попытка изменить балланс и упасть ниже нуля
        System.out.println(account);



    }
}