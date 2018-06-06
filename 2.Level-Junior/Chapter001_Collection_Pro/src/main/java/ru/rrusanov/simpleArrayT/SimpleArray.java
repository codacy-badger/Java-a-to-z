package ru.rrusanov.simpleArrayT;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * @author Roman Rusanov
 * @version 0.1
 * @since 20.05.2018
 *
 * SimpleArray class wrapper on array.
 * @param <T> generic type, that collection be contain.
 */
public class SimpleArray<T>  implements Iterable<T> {
    /**
     * The field is contain collection elements.
     */
    private ArrayList<T> models;
    /**
     * The index is counter of elements collection.
     */
    private int index = 0;
    /**
     * Default constructor of class.
     */
    public SimpleArray() {
        this.models = new ArrayList<>(5);
    }
    /**
     * The method add element to collection.
     * @param model element to add.
     */
    public void add(T model) {
        if (index > 4)
            throw new ArrayIndexOutOfBoundsException("Max models = 5");
            models.add(model);
            index++;
    }
    /**
     * The method set element in collection.
     * @param index of element to change.
     * @param model new element to insert.
     */
    public void set(int index, T model) {
     if (index > 4)
            throw new ArrayIndexOutOfBoundsException("Index model out of range");
            models.set(index, model);
    }
    /**
     * The method delete element from collection, replace value to null.
     * @param index to delete.
     */
    public void delete(int index) {
        if (index > 4)
            throw new ArrayIndexOutOfBoundsException("Index model out of range");
            models.set(index, null);
    }
    /**
     * The method get value from collection.
     * @param index element that return method.
     * @return value of that index.
     */
    public T get(int index) {
        if (index > 4)
            throw new ArrayIndexOutOfBoundsException("Index model out of range");
            return models.get(index);
    }
    /**
     * The method return iterator for collection.
     * @return iterator.
     */
    @Override
    public Iterator<T> iterator() {
        return models.iterator();
    }
}