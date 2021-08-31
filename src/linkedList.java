public class linkedList {

    Node header = null;
    Node last = null;
    int size;

    /*
        Constructor de la Clase linkedList, cuando se instancia el constructor inizializa
        el tamaño de la lista ligada simple en 0
     */
    linkedList () {
        size = 0;
    }

    //Si esta vacio retorna verdadero
    boolean isEmpty(){
        return header == null;
    }

    //Añade un nodo a la lista ligada simple
    void add(int number){
        //Se instancia el nodo con el valor numero ingresado
        Node node = new Node(number);

        if ( isEmpty() ){
            /*
                Si esta vacio se añade como primer nodo y se le asignan dos nodos apuntadores
                (header y last)
             */
            header = last = node;
        } else {
            /*
                Si ya hay nodos entonces primer el nodo last en su posicion siguiente se le asigna
                el nuevo nodo añadido y despues el nodo apuntador last se asigna al nodo añadido
                esto es porque es el ultimo nodo en agregarse y last debe esta hasta el final de
                la lista
            */
            last.next = node;
            last = node;
        }
        //Se incrementa el contador para tener el tamaño de la lista ligada simple
        size++;
    }

    //Muestra el contenido de la lista ligada simple
    void show(){
        for (Node node = header; node != null; node = node.next)
            System.out.println( node.getNumber() );
    }

    /*
        Busca el primero nodo que contenga el numero y lo retorna, si no existe el numero en
        la lista entonces el metodo retorna null
     */
    Node search(int number){
        for (Node node = header; node != null; node = node.next)
            if (number == node.number)
                return node;

        return null;
    }

    /*
        Metodo que elimina todos los nodos que contengan el numero ingresado, el metodo removera
        todos los nodos que contengan el numero
     */
    void delete (int number) {

        /*
            Primero eliminamos el numero si esta al principio de la lista (si es el primero)
            esto se hara consecutivamente hasta que el numero no aparezca primero
         */
        while (header.number == number)
            deleteFirst();

        /*
            Despues eliminamos el numero si se encuentra al final, el metodo dentro del bucle
            eliminara hasta que el numero no aparezca al final de la lista ligada simple
         */
        while (last.number == number)
            deleteLast();

        /*
            Si el nodo que contiene el numero ya no esta ni al inicio ni al final entonces
            se presupone que esta en medio, este metodo eliminara todos los nodos que contengan
            el numero que queremos eliminar
         */
        for (Node aux = header; aux != last; aux = aux.next)
            while(aux.next.number == number) {
                aux.next = aux.next.next;
                size--;
            }
    }

    /*
        Elimina primero, el nodo apuntador header siempre se debe de reasignar,
        header sera igual al nodo siguiente del nodo header
     */
    void deleteFirst () {
        if (isValid()){
            header = header.next;
            size--;
        }
    }

    /*
        Elimina el nodo al final de la lista, last se reasigna al nodo anterior a last
     */
    void deleteLast () {
        if (isValid()) {
            Node i = header;
            for ( ;i.next != last; i = i.next);
            i.next = null;
            last = i;
            size--;
        }
    }

    /*
        Metodo que valida que la lista no este vacia, tambien comprueba que si el nodo header es igual
        a last significa que solo hay un nodo, entonces header y last se incializan a null y el tamaño
        vuelve a ser cero. Independientemente de si el metodo entra a la seccion de if el metodo
        igual retornara si header es diferente de null (osea si no esta vacio retorna true)
     */
    boolean isValid () {
        if ( isEmpty() ){
            System.out.println("List Empty");
        } else if (header == last){
            header = last = null;
            size = 0;
        }
        return header != null;
    }

    //Retorna el tamaño de la lista ligada simple
    int getSize () {
        return size;
    }

}
