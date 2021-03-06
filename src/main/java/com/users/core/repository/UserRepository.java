package com.users.core.repository;

import com.users.core.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("repository")
public interface UserRepository extends JpaRepository<User, Serializable>, PagingAndSortingRepository<User, Serializable> {

    public abstract User findById(long id);

    public abstract User findByNameAndLastname(String name, String lastname);

    public abstract Page<User> findAll(Pageable pageable);

    public abstract User save(User user);

    public abstract User deleteById(long id);


}
