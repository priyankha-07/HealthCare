package com.intern.pentafox.organization.repository;

import com.intern.pentafox.organization.entity.HealthCare;
import jakarta.transaction.Transactional;
import lombok.Value;
import org.apache.catalina.User;
import org.hibernate.sql.Delete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories


public interface HealthCareRepository extends JpaRepository<HealthCare, Integer> {
    @Query(value = "SELECT * FROM health_care WHERE name = ?", nativeQuery = true)

    HealthCare findByName(String name);

    @Modifying
    @Query(value ="Delete from  health_care where id=? 1",nativeQuery = true )


    void deleteUser(int id);




}
