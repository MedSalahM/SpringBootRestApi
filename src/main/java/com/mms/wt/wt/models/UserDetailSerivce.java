package com.mms.wt.wt.models;

import com.mms.wt.wt.domain.User;
import com.mms.wt.wt.repositories.UserRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class UserDetailSerivce implements UserDetailsService {


    @Autowired
    UserRepositorie userRepositorie;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> user =userRepositorie.findByUsername(username);
        user.orElseThrow(()->new UsernameNotFoundException("Not found"+username));
     return user.map(MyUserDetails::new).get();
    }
}
