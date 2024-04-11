package org.example.rhm.project.Shopping.repository;

import org.example.rhm.project.Shopping.model.Shopping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingRepository extends JpaRepository<Shopping,String> {
}