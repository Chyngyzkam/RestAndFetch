package com.peaksoft.spring_bootcrudsucurity2.repository;
import com.peaksoft.spring_bootcrudsucurity2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.concurrent.ThreadPoolExecutor;

@Repository
public interface UserRepository  extends JpaRepository<User, Long> {

}

