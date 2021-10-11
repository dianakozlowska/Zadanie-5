public class Fruit {
    String taste;
    String color;
    int size;

    public Fruit() {
        this.taste = "słodki";
        this.color = "zielony";
        this.size = 3;
    }

    public Fruit(String taste, String color, int size) {
        this.taste = taste;
        this.color = color;
        this.size = size;
    }

    void show() {
        System.out.println("Owoc o smaku " + this.taste + "m" + ", kolorze " + this.color + "m" + " i wielkości : " + this.size);
    }
}
