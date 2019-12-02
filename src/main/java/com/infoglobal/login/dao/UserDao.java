package com.infoglobal.login.dao;

import com.infoglobal.login.entity.IGUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UserDao extends Repository<IGUser, String> {

    IGUser save(IGUser user);

    @Query("SELECT u FROM IGUser u where u.email=1")
    List<IGUser> findOneByEmail(String email);


}
