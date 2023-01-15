package com.huseyinaydin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huseyinaydin.entity.UserInfo;

import java.util.Optional;

/**
 * 
 @author Huseyin_Aydin
 @since 1994
 @category Spring Boot Security
 * 
 */

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
    Optional<UserInfo> findByName(String username);

}
