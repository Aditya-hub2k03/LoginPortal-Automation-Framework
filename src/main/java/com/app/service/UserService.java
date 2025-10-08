package com.app.service;

import com.app.model.User;

public interface UserService {
    User validateUser(String email, String password);
}
