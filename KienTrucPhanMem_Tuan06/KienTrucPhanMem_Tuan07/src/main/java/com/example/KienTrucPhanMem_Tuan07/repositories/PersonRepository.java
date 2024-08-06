package com.example.KienTrucPhanMem_Tuan07.repositories;

import com.example.KienTrucPhanMem_Tuan07.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PersonRepository extends JpaRepository<Person, Long>, JpaSpecificationExecutor<Person> {
}
