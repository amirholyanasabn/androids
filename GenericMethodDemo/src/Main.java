public class Main {
    public static void main(String[] args) {
        String[] names = {"Amirhossein", "Sepideh", "Gucci", "Vana", "Ali"};
        Integer[] age = {34, 32, 5, 34, 39};
        Character[] degree = {'B', 'A', 'A', 'B', 'C'};
        print(names);
        System.out.println("------------------");
        print(age);
        System.out.println("------------------");
        print(degree);
        System.out.println("-------------------");
    }
    private static  <T> void print(T[] array){
        for (int i=0 ; i<array.length;i++){
            System.out.println(array[i]);
        }
    }

}
