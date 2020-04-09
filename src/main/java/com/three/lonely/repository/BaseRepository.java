package com.three.lonely.repository;

import org.springframework.data.repository.Repository;

import java.util.Optional;

/**
 * @program: lonely
 * @author: Josiah
 * @create: 2020-04-09 21:58
 **/
public interface BaseRepository<T,ID> extends Repository<T,ID> {
    /**
     * 根据Id查询Entity
     * @param id id
     * @return Optional<T></>
     */
    Optional<T> findById(ID id);

    /**
     * 保存Entity
     * @param entity 实体类
     * @return S
     */
    <S extends T> S save(S entity);

}
