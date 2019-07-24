package com.lixinxinlove.mapper.base;

public interface BaseMapper<T> {

    T findById(Integer id);

    T findByUUID(String uuid);

    void deleteById(Integer id);

    void deleteByUUID(String uuid);

    void update(T t);

    void insert(T t);
}
