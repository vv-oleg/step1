package hello;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = "city", path = "city")
public interface CityRepository extends PagingAndSortingRepository<City, Long>{

    // find city by its name
    public List<City> findByNameLike(@Param("name") String name);

    // find city by its name or country with "like"
    @Query("SELECT c FROM City c WHERE " +
            "LOWER(c.name) LIKE LOWER(CONCAT('%',:searchTerm, '%'))")

    public List<City> findBySearchTerm(@Param("searchTerm") String searchTerm);
}
