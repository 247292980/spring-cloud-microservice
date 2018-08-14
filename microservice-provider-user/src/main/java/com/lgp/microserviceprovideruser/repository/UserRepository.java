package com.lgp.microserviceprovideruser.repository;

import com.lgp.microserviceprovideruser.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @AUTHOR lgp
 * @DATE 2018/2/26 14:28
 * @DESCRIPTION
 **/
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
