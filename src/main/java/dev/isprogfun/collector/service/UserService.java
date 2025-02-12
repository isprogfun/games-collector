package dev.isprogfun.collector.service;

import dev.isprogfun.collector.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
