package com.ns.nslookup.repository;

import com.ns.nslookup.entity.Contact;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ContactRepository implements DemoRepository<Contact> {
    private Map<Long, Contact> repository;

    public ContactRepository() {
        this.repository = new HashMap<>();
    }

    // Implementation for save method
    @Override
    public void save(Contact contact) {
        repository.put(contact.getId(), contact);
    }

    // Implementation for findCoustomerById method
    @Override
    public Contact findCoustomerById(Long id) {
        return repository.get(id);
    }
}
