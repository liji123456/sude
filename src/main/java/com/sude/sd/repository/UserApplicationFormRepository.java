package com.sude.sd.repository;

import com.sude.sd.domain.UserApplicationForm;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the UserApplicationForm entity.
 */
@SuppressWarnings("unused")
public interface UserApplicationFormRepository extends JpaRepository<UserApplicationForm,Long> {

}
