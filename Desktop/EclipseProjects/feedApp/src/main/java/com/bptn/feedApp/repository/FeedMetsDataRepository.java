package com.bptn.feedApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bptn.feedApp.jpa.FeedMetaData;

public interface FeedMetsDataRepository extends JpaRepository<FeedMetaData, Integer> {

}
