package com.sude.sd.service;

import com.sude.sd.domain.UserApplicationForm;
import com.sude.sd.repository.UserApplicationFormRepository;
import com.sude.sd.service.dto.UserApplicationFormDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.persistence.Id;
import java.util.LinkedList;
import java.util.List;

/**
 * Service Interface for managing UserApplicationForm.
 */
@Service
@Transactional
public class UserApplicationFormService {


    private final Logger log = LoggerFactory.getLogger(SdBalanceService.class);
    @Inject
    private UserApplicationFormRepository userRepository;


    UserApplicationForm save(UserApplicationForm userApplicationForm){
        return userRepository.save(userApplicationForm);
    }
    /**
     *  Get all the sdCompanies.
     *
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    @Transactional(readOnly = true)
    public Page<UserApplicationForm> findAll(Pageable pageable) {
        log.debug("Request to get all SdCompanies");
        Page<UserApplicationForm> result = userRepository.findAll(pageable);
        return result;
    }
}
