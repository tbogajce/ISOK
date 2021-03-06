package datacentar.dc.isok.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import datacentar.dc.isok.model.Risk;

@Repository
public interface RiskRepo extends CrudRepository<Risk, Long>{
	Risk findByRiskName(String riskName);

}
