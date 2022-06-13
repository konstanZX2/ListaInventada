import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LinkedList<E> {
    Element<E> firstElement;


    public LinkedList() {

    }

    public void insertFirst(E object) {
        Element<E> nuevoPrimerElemento = new Element<E>(object);

        if (firstElement == null) {
            firstElement = nuevoPrimerElemento;

        }else{


            nuevoPrimerElemento.setNextElement(firstElement);
            firstElement = nuevoPrimerElemento;
        }

    }

    public void insertLast(E object) {
        Element<E> nuevoUltimoElemento = new Element<E>(object);
        if (isEmpty()){
            firstElement = new Element<E>(object);
        }else{
            Element<E> element = firstElement;
            while (element.getNextElement() != null){
                element= element.getNextElement();
            }
            element.setNextElement(new Element<E>(object));
        }

        }



    public void print() {

        if (isEmpty()) {
            System.out.println("No hay nah");

        }
        Element sustitutoDeFirstElement = firstElement;
        while (sustitutoDeFirstElement != null) {

            System.out.println(sustitutoDeFirstElement.getObject());
            sustitutoDeFirstElement = sustitutoDeFirstElement.getNextElement();

        }
    }

    public boolean isEmpty() {
        return firstElement == null;
    }

    public void remove(Object object) {

    }

    public Object getFirstObject() {
        return firstElement;
    }

    public Object getLastObject() {

        Element sustitutoDeFirstElement = firstElement; //La creacion del "cursor" que recorre la lista y sustituye el
        //first element para que no tenga que modificarse, y que pueda hacer muchos metodos seguidos.

        while (sustitutoDeFirstElement.getNextElement() != null) {
            sustitutoDeFirstElement = sustitutoDeFirstElement.getNextElement();
        }

        return sustitutoDeFirstElement;
    }

    public Object getObjectAtPosition(int i) {
        int contador=1;
        Element<E> element = firstElement;
        while(element.getNextElement() != null){
            if (contador==1){
                break;
            }else {
                element = element.getNextElement();
            }
            contador++;
        }

        return element.getObject();
    }

    private class Element<E> {

        Element<E> nextElement = null;
        E object;


        public Element(E newObject) {
            this.object = newObject;

        }

        public void setNextElement(Element<E> newNextElement) {
            this.nextElement = newNextElement;

        }

        public Element getNextElement() {

            return nextElement;
        }

        public Object getObject() {
            return object;
        }

        public void setObject(E newObject) {
            object = newObject;
        }

        public void delete() {
            nextElement = null;
            object = null;

        }


    }
}

