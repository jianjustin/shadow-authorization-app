package org.jian.shadow.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * 自定义密码加密配置。默认BCryptPasswordEncoder
 */
@Component("passwordEncoder")
public class MyPasswordEncoder extends BCryptPasswordEncoder {

}
