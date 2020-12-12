package TPRM.Repository;

import TPRM.Model.Survey;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SurveyRepository extends PagingAndSortingRepository<Survey, Long> {
}
