package ru.rrusanov.collection.map;
import java.util.Calendar;
/**
 * @author Roman Rusanov
 * @version 0.1
 * @since 25.06.2018
 *
 * The class describes UserNotOverride model.
 */
public class UserNotOverride {
    /**
     * The field contain name of user.
     */
    private String name;
    /**
     * The field contain count of children.
     */
    private int children;
    /**
     * The field contain date in format calendar, birthday of user.
     */
    private Calendar birthday;
    /**
     * The constructor that initialize fields when instance user create.
     * @param name of user.
     * @param children count children's.
     * @param birthday date of birthday user.
     */
    public UserNotOverride(String name, int children, Calendar birthday) {
        this.name = name;
        this.children = children;
        this.birthday = birthday;
    }
    /**
     * The method getter for name field.
     * @return String.
     */
    public String getName() {
        return name;
    }
    /**
     * The method getter for children field.
     * @return int.
     */
    public int getChildren() {
        return children;
    }
    /**
     * The method getter for birthday field.
     * @return Calendar.
     */
    public Calendar getBirthday() {
        return birthday;
    }
}
