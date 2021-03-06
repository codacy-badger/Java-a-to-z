package ru.rrusanov.collection.map;
import java.util.Calendar;
/**
 * @author Roman Rusanov
 * @version 0.1
 * @since 25.06.2018
 *
 * The class describes UserOverrideHashCodeAndEquals model.
 */
public class UserOverrideHashCodeAndEquals {
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
    public UserOverrideHashCodeAndEquals(String name, int children, Calendar birthday) {
        this.name = name;
        this.children = children;
        this.birthday = birthday;
    }
    @Override
    public int hashCode() {
        return 31 * (this.name == null ? 0 : this.name.hashCode())
                + this.children
                + (this.birthday == null ? 0 : this.birthday.hashCode());
    }
    /**
     * Method compare to instance by fields name, children, birthday.
     * @param o object to compare.
     * @return if fields equals return true, otherwise false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        UserOverrideHashCodeAndEquals user = (UserOverrideHashCodeAndEquals) o;
        return this.name.equals(user.name)
                && this.children == user.children
                && this.birthday.equals(user.birthday);
    }
}
