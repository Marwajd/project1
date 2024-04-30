package com.example.project1.Repository;



import com.example.project1.Model.AdminModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<AdminModel, Long> {
    /*Optional<AdminModel> findByEmailAndPassword(String email, String Password);*/
}


