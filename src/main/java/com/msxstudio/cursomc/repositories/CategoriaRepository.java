package com.msxstudio.cursomc.repositories;

/*public class CategoriaRepository {

}


package  com.nelioalves.cursomc.repositories ;*/

import  org.springframework.data.jpa.repository.JpaRepository ;
import  org.springframework.stereotype.Repository ;

import  com.msxstudio.cursomc.domain.Categoria ;

@Repository
 public interface CategoriaRepository  extends JpaRepository < Categoria , Integer > {

}