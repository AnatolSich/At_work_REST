package app.repository;

import app.configuration.HelloWorldConfiguration;
import app.configuration.HelloWorldInitializer;
import app.configuration.HibernateConfig;
import app.model.Contact;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        loader=AnnotationConfigWebContextLoader.class,
        classes={HelloWorldConfiguration.class, HelloWorldInitializer.class, HibernateConfig.class}
)
public class ContactRepositoryImplTest {

    @Autowired
    ContactsRepository contactsRepository;

    @Test
    public void find_contacts_by_the_given_regExp() throws Exception {
        String regExp = "^A.*$";
        Contact contact = new Contact();
        contact.setName("Alex");
        contactsRepository.addContact(contact);
        List<Contact> contacts = contactsRepository.findContactsByRegExp(regExp);
        Contact existingUser = (Contact) contacts.get(0);
        String userName = existingUser.getName();
        Assert.assertEquals("Alex", userName);
    }

}