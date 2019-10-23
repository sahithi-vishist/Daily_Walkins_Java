package com.example.demo.service;
import java.util.List;

import com.example.demo.model.CompanyNameModel;

public interface CompanyNameService {


CompanyNameModel insertRec(CompanyNameModel rec);
CompanyNameModel update(CompanyNameModel rec);



public List<CompanyNameModel> getAllCompanies();

}
