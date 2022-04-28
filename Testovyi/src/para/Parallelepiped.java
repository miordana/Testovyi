package para;

public class Parallelepiped {

    public static void main(String[] args) {
        System.out.println("Parallelepiped");
        int a = 13; //a - длина
        int b = 16; //b - ширина
        int c = 21; //c - высота
        int lenght = 4 * a + 4 * b + 4 * c; // длина всех рёбер
        System.out.println("int lenght = 4 * a + 4 * b + 4 * c = " + lenght);

        int volume = a * b * c; // объём
        System.out.println("int volume = a * b * c = " + volume);


    }
}
