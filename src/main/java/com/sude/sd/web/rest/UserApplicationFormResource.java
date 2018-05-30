package com.sude.sd.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.sude.sd.service.UserApplicationFormService;
import com.sude.sd.web.rest.util.HeaderUtil;
import com.sude.sd.web.rest.util.PaginationUtil;
import com.sude.sd.service.dto.UserApplicationFormDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static org.elasticsearch.index.query.QueryBuilders.*;

/**
 * REST controller for managing UserApplicationForm.
 */
@RestController
@RequestMapping("/api")
public class UserApplicationFormResource {

    private final Logger log = LoggerFactory.getLogger(UserApplicationFormResource.class);
        
    @Inject
    private UserApplicationFormService userApplicationFormService;

    /**
     * POST  /user-application-forms : Create a new userApplicationForm.
     *
     * @param userApplicationFormDTO the userApplicationFormDTO to create
     * @return the ResponseEntity with status 201 (Created) and with body the new userApplicationFormDTO, or with status 400 (Bad Request) if the userApplicationForm has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
//    @PostMapping("/user-application-forms")
//    @Timed
//    public ResponseEntity<UserApplicationFormDTO> createUserApplicationForm(@Valid @RequestBody UserApplicationFormDTO userApplicationFormDTO) throws URISyntaxException {
//        log.debug("REST request to save UserApplicationForm : {}", userApplicationFormDTO);
//        if (userApplicationFormDTO.getId() != null) {
//            return ResponseEntity.badRequest().headers(HeaderUtil.createFailureAlert("userApplicationForm", "idexists", "A new userApplicationForm cannot already have an ID")).body(null);
//        }
//        UserApplicationFormDTO result = userApplicationFormService.save(userApplicationFormDTO);
//        return ResponseEntity.created(new URI("/api/user-application-forms/" + result.getId()))
//            .headers(HeaderUtil.createEntityCreationAlert("userApplicationForm", result.getId().toString()))
//            .body(result);
//    }
//
//    /**
//     * PUT  /user-application-forms : Updates an existing userApplicationForm.
//     *
//     * @param userApplicationFormDTO the userApplicationFormDTO to update
//     * @return the ResponseEntity with status 200 (OK) and with body the updated userApplicationFormDTO,
//     * or with status 400 (Bad Request) if the userApplicationFormDTO is not valid,
//     * or with status 500 (Internal Server Error) if the userApplicationFormDTO couldnt be updated
//     * @throws URISyntaxException if the Location URI syntax is incorrect
//     */
//    @PutMapping("/user-application-forms")
//    @Timed
//    public ResponseEntity<UserApplicationFormDTO> updateUserApplicationForm(@Valid @RequestBody UserApplicationFormDTO userApplicationFormDTO) throws URISyntaxException {
//        log.debug("REST request to update UserApplicationForm : {}", userApplicationFormDTO);
//        if (userApplicationFormDTO.getId() == null) {
//            return createUserApplicationForm(userApplicationFormDTO);
//        }
//        UserApplicationFormDTO result = userApplicationFormService.save(userApplicationFormDTO);
//        return ResponseEntity.ok()
//            .headers(HeaderUtil.createEntityUpdateAlert("userApplicationForm", userApplicationFormDTO.getId().toString()))
//            .body(result);
//    }
//
//    /**
//     * GET  /user-application-forms : get all the userApplicationForms.
//     *
//     * @param pageable the pagination information
//     * @return the ResponseEntity with status 200 (OK) and the list of userApplicationForms in body
//     * @throws URISyntaxException if there is an error to generate the pagination HTTP headers
//     */
//    @GetMapping("/user-application-forms")
//    @Timed
//    public ResponseEntity<List<UserApplicationFormDTO>> getAllUserApplicationForms(Pageable pageable)
//        throws URISyntaxException {
//        log.debug("REST request to get a page of UserApplicationForms");
//        Page<UserApplicationFormDTO> page = userApplicationFormService.findAll(pageable);
//        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/user-application-forms");
//        return new ResponseEntity<>(page.getContent(), headers, HttpStatus.OK);
//    }
//
//    /**
//     * GET  /user-application-forms/:id : get the "id" userApplicationForm.
//     *
//     * @param id the id of the userApplicationFormDTO to retrieve
//     * @return the ResponseEntity with status 200 (OK) and with body the userApplicationFormDTO, or with status 404 (Not Found)
//     */
//    @GetMapping("/user-application-forms/{id}")
//    @Timed
//    public ResponseEntity<UserApplicationFormDTO> getUserApplicationForm(@PathVariable Long id) {
//        log.debug("REST request to get UserApplicationForm : {}", id);
//        UserApplicationFormDTO userApplicationFormDTO = userApplicationFormService.findOne(id);
//        return Optional.ofNullable(userApplicationFormDTO)
//            .map(result -> new ResponseEntity<>(
//                result,
//                HttpStatus.OK))
//            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }
//
//    /**
//     * DELETE  /user-application-forms/:id : delete the "id" userApplicationForm.
//     *
//     * @param id the id of the userApplicationFormDTO to delete
//     * @return the ResponseEntity with status 200 (OK)
//     */
//    @DeleteMapping("/user-application-forms/{id}")
//    @Timed
//    public ResponseEntity<Void> deleteUserApplicationForm(@PathVariable Long id) {
//        log.debug("REST request to delete UserApplicationForm : {}", id);
//        userApplicationFormService.delete(id);
//        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert("userApplicationForm", id.toString())).build();
//    }
//
//    /**
//     * SEARCH  /_search/user-application-forms?query=:query : search for the userApplicationForm corresponding
//     * to the query.
//     *
//     * @param query the query of the userApplicationForm search
//     * @param pageable the pagination information
//     * @return the result of the search
//     * @throws URISyntaxException if there is an error to generate the pagination HTTP headers
//     */
//    @GetMapping("/_search/user-application-forms")
//    @Timed
//    public ResponseEntity<List<UserApplicationFormDTO>> searchUserApplicationForms(@RequestParam String query, Pageable pageable)
//        throws URISyntaxException {
//        log.debug("REST request to search for a page of UserApplicationForms for query {}", query);
//        Page<UserApplicationFormDTO> page = userApplicationFormService.search(query, pageable);
//        HttpHeaders headers = PaginationUtil.generateSearchPaginationHttpHeaders(query, page, "/api/_search/user-application-forms");
//        return new ResponseEntity<>(page.getContent(), headers, HttpStatus.OK);
//    }


}
