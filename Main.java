public class Main {
    public static void main(String args[]){
        LinkedList t = new LinkedList();
        int[] a = {7, 2, 9, 8, 6, 3};
        t.insertToFirst(10);
        t.traverse();
        t.addMany(a);
        System.out.println("\nTraverse: ");
        t.traverse();
        System.out.println("\nSearch: ");
        t.search(9);
    }
}

