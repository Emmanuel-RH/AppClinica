
package appclinica;

import java.util.Iterator;

public class MiListaEnlazada<T> implements Iterable<T> {
    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int tamaño;
    
    // Constructor
    public MiListaEnlazada() {
        this.primero = null;
        this.ultimo = null;
        this.tamaño = 0;
    }

    // Método para agregar un elemento al final de la lista
    public void agregarAlFinal(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);

        if (isEmpty()) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            ultimo.setSiguiente(nuevoNodo);
            ultimo = nuevoNodo;
        }

        tamaño++;
    }

    // Método para agregar un elemento al principio de la lista
    public void agregarAlPrincipio(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);

        if (isEmpty()) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(primero);
            primero = nuevoNodo;
        }

        tamaño++;
    }

    // Método para obtener el tamaño de la lista
    public int tamaño() {
        return tamaño;
    }

    // Método para verificar si la lista está vacía
    public boolean isEmpty() {
        return tamaño == 0;
    }

    // Método para imprimir la lista
    public void imprimirLista() {
        Nodo<T> actual = primero;
        while (actual != null) {
            System.out.print(actual.getElemento() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println();
    }

    // Clase interna Nodo
    private static class Nodo<T> {
        private T elemento;
        private Nodo<T> siguiente;

        public Nodo(T elemento) {
            this.elemento = elemento;
            this.siguiente = null;
        }

        public T getElemento() {
            return elemento;
        }

        public Nodo<T> getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo<T> siguiente) {
            this.siguiente = siguiente;
        }
    }
    
       @Override
    public Iterator<T> iterator() {
        return new MiListaEnlazadaIterator();
    }

    // Clase interna para el iterador
    private class MiListaEnlazadaIterator implements Iterator<T> {
        private Nodo<T> actual = primero;

        public boolean hasNext() {
            return actual != null;
        }

        
        public T next() {
            if (!hasNext()) {
                throw new IllegalStateException("No hay más elementos en la lista");
            }

            T elemento = actual.getElemento();
            actual = actual.getSiguiente();
            return elemento;
        }
    }
}
