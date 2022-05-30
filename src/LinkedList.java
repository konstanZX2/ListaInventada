import java.util.Scanner;

public class LinkedList {
    Element firstElement;


    public LinkedList() {
        LinkedList linkedList = new LinkedList();
    }

    public void insertFirst(Object object) {
    if(isEmpty())


    }

    public void insertLast(Object object) {

    }

    public void print() {
        while (firstElement.getNextElement() != null){
            System.out.println();


        }

    }

    public boolean isEmpty() {
        return firstElement == null;
    }
        public void remove (Object object){

        }

        public Object getFirstObject () {
        return firstElement;
        }

        public Object getLastObject () {

        Element sustitutoDeFirstElement =firstElement; //La creacion del "cursor" que recorre la lista y sustituye el
            //first element para que no tenga que modificarse y poder hacer muchos metodos seguidos.

        while(sustitutoDeFirstElement.getNextElement() != null){
            sustitutoDeFirstElement=sustitutoDeFirstElement.getNextElement();
            }

            return sustitutoDeFirstElement; }

        public Object getObjectAtPosition ( int i){

        }

        private class Element {

            Element nextElement;
            Object object;


            public Element(Object newObject) {
                this.object = newObject;

            }

            public void setNextElement(Element newNextElement) {
                this.nextElement = newNextElement;

            }

            public Element getNextElement() {

                return nextElement;
            }

            public Object getObject() {
                return object;
            }

            public void setObject(Object newObject) {
                object = newObject;
            }

            public void delete() {
                nextElement = null;
                object = null;

            }


        }
    }

