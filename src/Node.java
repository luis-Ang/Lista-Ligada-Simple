public class Node {

    //Variables de la clase Node
    int number;
    Node next;

    //Contructor por defecto de la clase Node
    public Node(){

    }

    /*
        Cuando se instancia Node a number se le asigna el argumento asignado por parametro y
        next se asigna a null
     */
    public Node(int number){
        this.number = number;
        this.next = null;
    }

    //Retorna el numero que contiene el nodo
    public int getNumber() {
        return number;
    }

    //sirve para asignarle al nodo el valor de un numero
    public void setNumber(int number) {
        this.number = number;
    }

    //Utilizamos toString para imprimir los atributos (variables) de la clase Node
    @Override
    public String toString() {
        return "Node{ number=" + number + ", next=" + next + " } ";
    }
}
