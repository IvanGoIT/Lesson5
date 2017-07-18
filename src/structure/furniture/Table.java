package structure.furniture;

public class Table {
    private int weight;
    private Glue glue;

    public Table() {
        this.glue.name = "клей";
    }

    // у класса Клей есть доступ к приватным переменным класса Стол,
    // поскольку он вложен внутрь стола
    private class Glue {
        public String name;
        public int outdate;

        public void doSomething() {
            Table.this.weight = 200;
        }
    }
}
