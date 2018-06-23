package app.repository;

import app.model.Contact;

import java.util.List;

/**
 * Created by TEMAPROF on 11.06.2017.
 */

public interface ContactsRepository {
    List<Contact> findContactsByRegExp(String regExp);

    void addContact(Contact contact);
}
