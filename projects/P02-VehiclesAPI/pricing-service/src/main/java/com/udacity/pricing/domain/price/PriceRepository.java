package com.udacity.pricing.domain.price;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

public interface PriceRepository extends CrudRepository<Price, Long> {

}
