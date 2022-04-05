package com.cybage.repository;




import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cybage.model.Book;


@Repository                                  //integer is type of primary key beacuse we don't use object
public interface BookRepository extends JpaRepository<Book, Integer> {
	
	List< Book>findByName(String name);
    List< Book>findByDesignation( String designation);
    
    @Query("select e from Employee e where e.designation=:desg and e.salary=:sal")
    List< Book> getEmpByDesignation(@Param("sal") int salary , @Param("desg") String designation);
    
    
}