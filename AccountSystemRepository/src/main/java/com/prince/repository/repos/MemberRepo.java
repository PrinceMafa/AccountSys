package com.prince.repository.repos;

import com.prince.domain.persistence.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepo extends JpaRepository<Member,Long> {
}
