package com.Innovationship.LoginSignUpHRCloud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Innovationship.LoginSignUpHRCloud.Model.UserDetail;

public interface UserDetailRepo extends JpaRepository<UserDetail, String> {
     UserDetail findByEmailAndPassword(String email, String password);
}
