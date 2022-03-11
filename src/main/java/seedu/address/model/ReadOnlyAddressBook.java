package seedu.address.model;

import javafx.collections.ObservableList;
import seedu.address.model.book.Book;
import seedu.address.model.person.Patron;

/**
 * Unmodifiable view of an address book
 */
public interface ReadOnlyAddressBook {

    /**
     * Returns an unmodifiable view of the patrons list.
     * This list will not contain any duplicate patrons.
     */
    ObservableList<Patron> getPatronList();

    /**
     * Returns an unmodifiable view of the books list.
     */
    ObservableList<Book> getBookList();
}
