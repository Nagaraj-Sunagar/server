package com.ns.nslookup.services;

import org.springframework.stereotype.Service;
import java.util.HashMap;

@Service
public class ContactService {
    HashMap<Integer,String> contactList = new HashMap<>();
    public ContactService(){
        contactList.put(0,"Nagaraj");
        contactList.put(1,"Niteesh");
    }
    public String getCustomer(int id){
       return contactList.get(id);
    }
}
