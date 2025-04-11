package org.itforjava.service;

import org.itforjava.entity.User;

public interface UserService {
    User findByName(String username);

    void add(String username, String md5String);

    boolean update(User updateUser);
}
