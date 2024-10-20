package com.ns.nslookup.repository;

public interface DemoRepository<T> {
    public void save(T t);
    public T findCoustomerById(Long id);
}
