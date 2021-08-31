public class test {

    public static void main(String []args) {

        //Instanciamos una variable de la lista ligada simple
        linkedList list = new linkedList();

        //Añadimos valores en la lista ligada
        list.add(5);
        list.add(5);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(5);
        list.add(13);
        list.add(5);
        list.add(14);
        list.add(5);
        list.add(5);
        list.add(5);

        //Mostramos la lista ligada
        System.out.println();
        list.show();

        //Eliminamos de la lista todos los nodos con el valor 5
        System.out.println("\nDeleting...");
        list.delete(5);
        //Mostramos la lista
        System.out.println();
        list.show();
        //Imprimimos el tamaño de la lista ligada
        System.out.println("Size :" + list.size + "\n");

        /*
            Buscamos un nodo con el valor 14, si existe en la lista se retornara el primer valor
            que se encuentre con este numero, sino existe en la lista retornara null
         */
        System.out.println("\nSearching Node\n");
        System.out.println( list.search(14) );

    }
}
