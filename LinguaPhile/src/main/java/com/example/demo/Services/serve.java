package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.pojo;
import com.example.demo.Repository.repo;

@Service
public class serve {
	@Autowired
	repo lp_repo;
	public String addLPuser(pojo lp_model)
	{
		lp_repo.save(lp_model);
		return "Added a LP User!";
	}
	public List<pojo> getLPuser()
	{
		return lp_repo.findAll();
	}
	public Optional<pojo> getLPuserById(int id)
	{
		return lp_repo.findById(id);
	}
	public String updateLPuser(pojo lp_model)
	{
		lp_repo.save(lp_model);
		return "Updated a LP User!";
	}
	public String deleteByRequestParamId(int id)
	{
		lp_repo.deleteById(id);
		return "Deleted a LP User!";
	}
}
