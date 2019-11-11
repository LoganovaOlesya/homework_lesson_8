
/**
 *package com.company.model.
 * improvement with FindBugs and CheckStyle.
 * @version 1.2
 * @author LoganovaOlesya
 */
package com.company.model;

/**
 * Class Box
 * improvement with FindBugs and CheckStyle.
 * @version 1.2
 * @author LoganovaOlesya
 * @param <T>
 */
public class Box<T> {
    /**
     * boolean isEmpty is a trigger for function putInBox.
     */
    private boolean isEmpty = true;

    /**
     *input generic for putInBox.
     */
    private T element = null;

    /**
     * function for put object in a box.
     */
    public void putInBox(final T elem) {
        if (isEmpty) {
            element = elem;
            isEmpty = false;
        } else {
            throw new RuntimeException("Box is not empty!");
        }
    }

    /**
     * function for show object in a box.
     */
    public T getOutOfBox() {
        if (!isEmpty) {
            return element;
        } else {
            throw new RuntimeException("box is empty!");
        }
    }

    /**
     * function for delete object from a box.
     */
    public void deleteFromBox() {
        if (!isEmpty) {
            element = null;
            isEmpty = true;
        }
    }

}