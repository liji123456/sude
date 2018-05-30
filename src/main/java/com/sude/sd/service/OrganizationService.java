package com.sude.sd.service;

import com.sude.sd.domain.Organization;
import com.sude.sd.repository.OrganizationRepository;
import com.sude.sd.repository.SdBalanceRepository;
import com.sude.sd.repository.search.SdBalanceSearchRepository;
import com.sude.sd.service.dto.OrganizationDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.LinkedList;
import java.util.List;

/**
 * Service Interface for managing Organization.
 */
@Service
@Transactional
public class OrganizationService {

    private final Logger log = LoggerFactory.getLogger(SdBalanceService.class);

    @Inject
    private OrganizationRepository organizationRepository;

    Organization save(Organization organization){
      return organizationRepository.save(organization);
    }

}
