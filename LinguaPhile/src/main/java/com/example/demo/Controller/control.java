package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.pojo;
import com.example.demo.Services.serve;

@RestController
@RequestMapping("/LPuser")
public class control {
	@Autowired
	serve lp_server;
	@PostMapping(" ")
	public String create(@RequestBody pojo lp_model)
	{
		return lp_server.addLPuser(lp_model);
	}
	@GetMapping(" ")
	public List<pojo> read()
	{
		return lp_server.getLPuser();
	}
	@GetMapping("/{id}")
	public Optional<pojo> readById(@PathVariable int id)
	{
		return lp_server.getLPuserById(id);
	}
	@PutMapping("/Update_LPuser")
	public String update(@RequestBody pojo lp_model)
	{
		return lp_server.updateLPuser(lp_model);
	}
	@DeleteMapping("/Delete_LPuser")
	public String delete(@RequestParam ("LPid") int id)
	{
		return lp_server.deleteByRequestParamId(id);
	}
}

