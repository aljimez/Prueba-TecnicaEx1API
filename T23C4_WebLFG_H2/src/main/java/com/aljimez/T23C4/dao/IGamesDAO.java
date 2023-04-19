package com.aljimez.T23C4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aljimez.T23C4.dto.Games;

/**
 * @author Jose
 *
 */
public interface IGamesDAO extends JpaRepository<Games, Long>{

}