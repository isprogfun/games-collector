package dev.isprogfun.collector.repository;

import dev.isprogfun.collector.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
}
