package com.journey.jpa.repository;

import com.journey.jpa.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by chen on 2018/4/14.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    @Query(value = "select o from User as o where o.gender =:gender ")
    List<User> findByGender(@Param("gender")Character genders);

    @Modifying
    @Transactional
    @Query(value = "update User o set o.gender =:newGender where o.gender =:oldGender ")
    void changeGender(@Param("newGender") Character newGender,@Param("oldGender") Character oldGender);
}
