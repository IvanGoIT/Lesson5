package animal;

public class Dog {

    // ===== Переменные ============================
    // =============================================
    // public - доступ откуда угодно
    // private - доступ только из текущего класса
    // protected - работает подобно private
    private int age;
    private String name = "Бобик";
    private int weight = 10;


    // ===== Конструкторы ==========================
    // =============================================

    public Dog() {

    }

    public Dog(String name) {
        this(name, 2, 10);
    }

    public Dog(String name, int age) {
        this(name, age, 10);
    }

    public Dog(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // ===== Методы ================================
    // =============================================

    public void showInfo() {
        System.out.println("Собаку зовут:" + name);
        System.out.println("Собаке " + age + " лет");
    }

    // ===== Геттеры и Сеттеры =====================
    // =============================================

    // age собаки ----------------------
    // сеттер возраста
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Неверный возраст");
        } else {
            this.age = age;
        }
    }

    // геттер возраста
    public int getAge() {
        return age;
    }
    // ---------------------------------

    // доступ к весу собаки ------------
    public int getWeight() {
        return weight;
    }
    // ---------------------------------


    // Пример как ДЕЛАТЬ НЕ НАДО. Должен быть один сеттер на одну переменную
    public void setAgeAndName(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
