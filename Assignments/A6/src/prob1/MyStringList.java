package prob1;

import java.util.Arrays;

public class MyStringList {
    private final int INITIAL_LENGTH = 4;
    private String[] strArray;
    private int size;

    public MyStringList() {
        strArray = new String[INITIAL_LENGTH];
        size = 0;
    }

    // Add an element in last
    public void add(String s) {
        if (s == null) return;// throw new NullPointerException();
        //Check for Array is Full
        if (size == strArray.length)
            resize(); // Array is full
        // Add at the end of the list.
        strArray[size] = s;
        size++; // Increment index to insert the new elements
        // strArray[size++] = s;
    }

    public String get(int i) {
        if (i < 0 || i > size - 1) {
            // throw new IndexOutOfBoundsException("Invalid index i" + i);
            return null;
        }
        return strArray[i];
    }

    public boolean find(String s) {
        if (s == null)
            return false;
        for (int i = 0; i < size; i++)// for (String test: strArray)
        {
            if (s.equals(strArray[i]))
                return true;

        }
        return false; // The element is not in the list
    }

    /* 1. Using System.arrayopy()
      public void insert(String s, int pos){
         if(pos > size-1 || pos<0 )
             return;//allowed to add 0 to size-1
      if(s==null) return;
      if(pos == strArray.length) {
          resize();
       }
      String[] temp = new String[strArray.length];
       System.arraycopy(strArray,0,temp,0,pos); // src, spos,des,dspos,number of elements temp[pos] = s;
        temp[pos] = s;
      System.arraycopy(strArray,pos,temp,pos+1, strArray.length - pos);// count =size - pos

      strArray = temp;
      ++size;
       }
     */
	/* 2. Without Temp array
	// Shift elements to the right to make space for the new element
        for (int i = size; i > pos; i--) {
            array[i] = array[i - 1];
        }
        // Insert the new element
        array[pos] = s;
        size++;
    }

	 */
    // can insert the elements 0 to size position
    public void insert(String s, int pos) {
        if (pos < 0 || pos > size)
            return;
        // If the array gets full
        if (size == strArray.length) {
            resize();
        }
        String[] temp = new String[strArray.length];

        for (int i = 0; i < pos; i++)
            temp[i] = strArray[i];
        temp[pos] = s;

        for (int i = pos + 1; i < size; i++)
            temp[i] = strArray[i - 1];

        strArray = temp;
        ++size;
    }

    public boolean remove(String s) {
        if (size == 0)
            return false; // the list is empty
        if (s == null)
            return false;
        int index = -1;
        for (int i = 0; i < size; ++i) {
            if (strArray[i].equals(s)) {
                index = i;
                break;
            }
        }
        if (index == -1)
            return false; // s is not found in the list
        String[] temp = new String[strArray.length];
        System.arraycopy(strArray, 0, temp, 0, index);
        System.arraycopy(strArray, index + 1, temp, index,
                strArray.length - (index + 1));
        strArray = temp;
        --size;
        return true;
    }

    private void resize() {
        System.out.println("resizing");
        int len = strArray.length;// Original array length
        int newlen = 2 * len; // Twice the original length
        // String[] temp = new String[newlen];
        // System.arraycopy(strArray,0,temp,0,len);
        // strArray = temp;
        strArray = Arrays.copyOf(strArray, newlen);

    }

    public String toString() {
        if (size() == 0) return "[]";

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; ++i) {
            sb.append(strArray[i] + ", ");
        }
        sb.append(strArray[size - 1] + "]");
        return sb.toString();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        /*
         * if(size==0) return false; else return true;
         */
        return (size == 0);
    }

    public static void main(String[] args) {
        MyStringList l = new MyStringList();
        l.add("Bob");
        l.add("Steve");
        l.add("Susan");
        l.add("Mark");
        l.insert("Renuka", 4); // Position reached the length
        l.insert("Mohanraj", 5); // Position reached the length
        l.add("Dave");


        // My tests

        //Method 1
        System.out.println("\nMethod 1");
        l.indexOf(null); // -1
        l.indexOf("Susan"); // Position: 2

        //Method 2
        System.out.println("\nMethod 2");
        l.removeAt(-1); // null
        l.removeAt(2); // Susan
        l.removeAt(100); // null

        // Method 3
        System.out.println("\nMethod 3");
        // l.clear(); // Uncomment this to test clear method
        System.out.println("Size: " + l.size());
        System.out.println(l.toString());

        // Method 4
        System.out.println("\nMethod 4");
        l.set(2, "Joao");
        System.out.println(l.toString());

        // Method 5
        System.out.println("\nMethod 5");

        MyStringList l2 = new MyStringList();
        l2.add("Bob");
        l2.add("Steve");
        l2.add("Susan");
        l2.insert("Renuka", 4); // Position reached the length
        l2.insert("Mohanraj", 5); // Position reached the length
        l2.add("Dave");

        boolean lContainsAllResponse = l.containsAll(l2);
        System.out.println("l.containsAll(l2) = " + lContainsAllResponse);

        l2.set(2, "Joao");
        System.out.println(l.toString());
        System.out.println(l2.toString());
        boolean lContainsAllResponse2 = l.containsAll(l2);
        System.out.println("l.containsAll(l2) = " + lContainsAllResponse2);

        // Method 6
        System.out.println("\nMethod 6");

        MyStringList subList = l.subList(2, 4);
        System.out.println(subList.toString());
    }


    //region MY METHODS

    // Method 1: public int indexOf(String s);
    //
    // indexOf(String s)
    //  - Return the position (index) of the first occurrence of s in the list.
    //  - If s is not found, return -1.
    public int indexOf(String s) {
        for (int i = 0; i < size; i++) {
            if (strArray[i].equals(s)) {
                return i;
            }
        }
        return -1;
    }

    // Method 2: public String removeAt(int index);
    //
    // removeAt(int index)
    //  - Remove the element at the given position.
    //  - Shift all elements on the right to fill the gap.
    //  - Return the removed element.
    //  - If index is invalid, return null.

    public String removeAt(int index) {
        if (index < 0 || index >= size) return null;

        String removed = strArray[index];
        for (int i = index; i < size - 1; i++) {
            strArray[i] = strArray[i + 1];
        }
        --size;
        return removed;
    }

    //  Method 3: public void clear()
    //
    //  clear()
    //      - Remove all elements from the list so that it becomes empty.
    //      - Set each element in the underlying array to null.
    //      - reset the size of the list to 0.
    //      - After calling clear():
    //      - size() must return 0.
    //      - toString() should print an empty list like [].
    public void clear() {
        strArray = new String[INITIAL_LENGTH];
        size = 0;
    }

    //Method 4: public void set(int index, String s); <-------
    //
    //set(int index, String s)
    //    - Replace the element at position index with s.
    //    - Return the old element that was replaced.
    //    - If index is invalid, return null.  <--------
    public void set(int index, String s) {
        if (index < 0 || index >= size) return; // The method is void, so we can't return null

        strArray[index] = s;
    }

    //Method 5: public boolean containsAll(MyStringList other);
    //
    //containsAll(MyStringList other)
    //    - Return true if the current list contains every element of other.
    //    - Order doesn’t matter.
    //    - Return false if even one element is missing.
    public boolean containsAll(MyStringList other) {
        if (other == null) return false;

        for (int i = 0; i < other.size(); i++) {
            if (!this.find(other.get(i))) return false;
        }
        return true;
    }

    //Method 6: public MyStringList subList(int start, int end);
    //
    //subList(int start, int end)
    //    - Return a new MyStringList containing elements from index start to end - 1.
    //    - If indices are invalid, return an empty list.
    public MyStringList subList(int start, int end) {
        if (start < 0 || end > size || start > end) return new MyStringList();

        MyStringList subList = new MyStringList();

        for (int i = start; i < end; i++) {
            subList.add(strArray[i]);
        }
        return subList;
    }

    //endregion
}
