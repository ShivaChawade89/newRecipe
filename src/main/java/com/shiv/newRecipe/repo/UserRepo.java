package com.shiv.newRecipe.repo;

import com.shiv.newRecipe.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User,Integer> {
    @Query(value = "select * from  user where user_name =:username && password=:password",nativeQuery = true)
    User FindByUserNameANDPassword(String username, String password);
}
