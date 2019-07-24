package com.lixinxinlove.service.base;

public interface IBaseService<T> {
     T findById(Integer id);

     T findByUUID(String uuid);

     void deleteById(Integer id);

     void deleteByUUID(String uuid);

     void update(T t);

     void insert(T t);
}
