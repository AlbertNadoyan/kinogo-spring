package com.example.kinogospring.service.adminservice;



public interface AdminService<T> {

    void delete(int id);

    void save(T t);

    String edit(T t);
}
