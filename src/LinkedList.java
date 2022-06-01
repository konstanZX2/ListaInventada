import java.util.Scanner;

public class LinkedList {
    Element firstElement;


    public LinkedList() {

    }

    public void insertFirst(Object object) {
        Element nuevoPrimerElemento = new Element(object);
        if(firstElement==null){
            firstElement=nuevoPrimerElemento;
        }

            nuevoPrimerElemento.setNextElement(firstElement);
            firstElement=nuevoPrimerElemento;


    }

    public void insertLast(Object object) {

    }

    public void print() {

        if (isEmpty()){
            System.out.println("No hay nah");

        }
        Element sustitutoDeFirstElement = firstElement;
        while (sustitutoDeFirstElement != null){
            System.out.println(sustitutoDeFirstElement.getObject());
            sustitutoDeFirstElement=sustitutoDeFirstElement.getNextElement();

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
            //first element para que no tenga que modificarse, y que pueda hacer muchos metodos seguidos.

        while(sustitutoDeFirstElement.getNextElement() != null){
            sustitutoDeFirstElement=sustitutoDeFirstElement.getNextElement();
            }

            return sustitutoDeFirstElement; }

        public Object getObjectAtPosition ( int i){

        return null;}

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

