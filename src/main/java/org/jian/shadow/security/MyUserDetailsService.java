package org.jian.shadow.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    public InMemoryUserDetailsManager manager;

    public MyUserDetailsService(){
        manager = new InMemoryUserDetailsManager();
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        manager.createUser(User.withUsername("user").password(passwordEncoder.encode("123456")).authorities("ROLE_USER").build());
        manager.createUser(User.withUsername("admin").password(passwordEncoder.encode("admin")).authorities("ROLE_ADMIN").build());
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return manager.loadUserByUsername(s);
    }
}
