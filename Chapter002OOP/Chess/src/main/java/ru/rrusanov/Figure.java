package ru.rrusanov;
import  java.util.Date;
/** Class describes chess figure.
 * @author Roman Rusanov
 * @since 13.11.2017
 * @version 0.1
 */
public abstract class Figure {
    /**
     * Constructor for figure.
     */
    Figure(Cell position) {
        this.position = position;
        this.id = getId();
    }
    /**
     * Position figure on board chess.
     */
    final Cell position;
    /**
     * Id unique for figure timestamp + cell position;
     */
    final long id;
    /**
     * generate unique id for figure.
     * @return int id.
     */
    public long getId() {
        Date date = new Date();
        long result = date.getTime() + position.getX() + position.getY();
        return result;
    }
    /**
     * Way that figure can cross on board.
     * @param dest where you wan to move figure.
     * @return Cell[] all cells that figure need go to the destination cell.
     */
    abstract Cell[] way(Cell dest) throws ImpossibleMoveException, ImpossibleCreateCellException;
    /**
     * Override equals methods.
     * @return True if the compare figure one and same.
     */
    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (this == null || !(this instanceof Figure)) return false;
        Figure figure = (Figure) otherObject;
        if (this.id == figure.id) {
            return true;
        } else {
            return false;
        }
    }

}
