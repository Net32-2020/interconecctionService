package com.azureClaroPayAgile.soap.service;

import org.springframework.stereotype.Service;

import com.azureClaroPayAgile.soap.workitem.IssueWorkItem;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class IssueService {
	private static final Map<Integer, IssueWorkItem> issueWI = new HashMap<>();
	
	@PostConstruct
    public void initialize() {
		
		IssueWorkItem issue = new IssueWorkItem();
		issue.setIdIssue(1);
		issue.setTitulo("TITULO - ISSUE");
		issue.setDescripcion("DESCRIPCION DEL ISSUE DE PRUEBA");
		issue.setEstado("ACTIVE");
		issueWI.put(1, issue);
		
	}

	public IssueWorkItem getIssue(int id)
		{
			return issueWI.get(1);
		}
}
