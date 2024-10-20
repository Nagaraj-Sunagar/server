package com.ns.nslookup.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
    private Long id;
    private String name;
    private String email;
    private String message;
    @Override public String toString()
    {
        return "Student"
                + "id=" + id + ", name='" + name + '\''
                + ", email=" + email + ", message=" + message;
    }
}