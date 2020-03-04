package com.mycompany.myapp.repository;
//<--! package -->

import com.mycompany.myapp.domain.PhotoLite;
//<--! import -->
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoLiteRepository extends JpaRepository<PhotoLite, Long>, JpaSpecificationExecutor<PhotoLite> {

}
