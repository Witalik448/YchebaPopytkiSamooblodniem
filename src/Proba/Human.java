package Proba;

public class Human {

    String surname;
    String name;
    int age;
    int time;

    public Human (String surname, String name, int age) {
        this.surname = surname;
        this.name = name;
        this.age = age;
    }
    public void budilnik (int time) {
        this.time = time;
        switch (time) {
            case 9:
                System.out.println("Даня идет чистить зубы");
                break;
            case 10:
                System.out.println("Даня идет завтракать");
                break;
            case 11:
                System.out.println("Даня получает пиздюлей");
                break;
            case 12:
                System.out.println("Даня ловит паническую атаку");
                break;
            default:
                System.out.println("Даня спит дальше");
                break;

        }
    }
}
class Test {
    public static void main (String[]args) {
        Human chelovek = new Human("Ivanin","Daniil",23);
        chelovek.budilnik(9);
    }
}