public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(5);
        System.out.println("Fila vazia: " + fila.isEmpty());
        fila.offer('a');
        fila.offer('b');
        fila.offer('c');
        fila.offer('d');
        fila.offer('e');
        System.out.println(fila);
        fila.poll();
        fila.poll();
        fila.offer('f');
        fila.offer('g');
        System.out.println(fila);

        System.out.println("Hello ");
    }
}
