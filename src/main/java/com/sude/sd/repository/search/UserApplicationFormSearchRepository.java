package com.sude.sd.repository.search;

import com.sude.sd.domain.UserApplicationForm;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data ElasticSearch repository for the UserApplicationForm entity.
 */
public interface UserApplicationFormSearchRepository extends ElasticsearchRepository<UserApplicationForm, Long> {
}
