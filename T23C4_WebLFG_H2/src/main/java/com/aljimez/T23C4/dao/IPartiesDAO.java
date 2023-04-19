package com.aljimez.T23C4.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aljimez.T23C4.dto.Parties;

public interface IPartiesDAO extends JpaRepository<Parties, Long>{


}