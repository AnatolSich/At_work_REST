package app.repository;


import app.model.Contact;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by TEMAPROF on 11.06.2017.
 */
@Repository
@Transactional
public class ContactsRepositoryImpl implements ContactsRepository {

    private final SessionFactory sessionFactory;

    @Autowired
    public ContactsRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Contact> findContactsByRegExp(String regExp) {
        Session session = sessionFactory.getCurrentSession();
        List<Contact> contacts = session.createNativeQuery("SELECT * FROM Contact c WHERE c.name ~ :name ", Contact.class).setParameter("name", regExp).list();
        return contacts;
    }

    @Override
    public void addContact(Contact contact) {
        Session session = sessionFactory.getCurrentSession();
        session.save(contact);
    }
}
