package dataStructures;

public class ArrayLst {
    //private boolean isEmpty = true;
    private int numberOfElement;
    private String element;
    private String[] elements = new String[3];

    public boolean isEmpty(){
        //return isEmpty;
        return numberOfElement == 0;
    }

    public void addElement(String  element){
        if(size()== elements.length) createNewArray();
        elements[numberOfElement] = element;
        numberOfElement++;
    }

    public void addElement(int index, String element){
        if(size()== elements.length) createNewArray();

        String[] oo = new String[elements.length];

        for(int count = 0; count < size() + 1; count++){
           if(count == index - 1) continue;
           if (count > index - 1){
               oo[count] = elements[count];
               continue;
           }
           oo[count] = elements[count];
        }
        oo[index - 1 ] = element;
        elements = oo;
        numberOfElement++;
    }

    private void createNewArray() {
        String[] newArray = new String[elements.length * 2];

        if(size() >= 0) System.arraycopy(elements, 0, newArray, 0, size());
        elements = newArray;
    }


    public void removeElement(String element){
        if(isEmpty()) throw new ArrayIndexOutOfBoundsException("List is empty");
        if(!contains(element)) throw new IllegalArgumentException(element + " is not on the list");

        elements = removeElementBy("element");
        numberOfElement--;
    }

    private boolean contains(String element) {
            for (String string : elements) if (element.equals(string)) return true;
            return false;
    }


    public void removeElement(int index){
        if(isEmpty()) throw new ArrayIndexOutOfBoundsException("List is empty");
        numberOfElement--;
    }

    public String getElement(int index){
        return elements[index-1];
    }

    public int getIndex(String element){
        for(int index = 0; index < elements.length; index++){
            if(elements[index] .equals(element))
                return index;
        }
        return 0;
    }

    private String[] removeElementBy(String element){
        String[] temp = new String[elements.length];
        int counter = 0;

        for(int position = 0; position < elements.length; position++){
            if(elements[position].equals(element)) continue;

            temp[counter] = elements[position];
            counter++;

        }
        return temp;
    }

    private String[] removeElementBy(int  index){
        String[] temp = new String[elements.length];
        int counter = 0;

        for(int position = 0; position < elements.length; position++){
            if(position == index) continue;

            temp[counter] = elements[position];
            counter++;

        }
        return temp;
    }

    public int size(){
        return numberOfElement;
    }




}
