package com.azureClaroPayAgile.soap.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.azureClaroPayAgile.soap.service.IssueService;
import com.azureClaroPayAgile.soap.workitem.GetIssueRequest;
import com.azureClaroPayAgile.soap.workitem.GetIssueResponse;

@Endpoint
public class IssueEndPoint {
	
	@Autowired
	private IssueService issueService;
	
	@PayloadRoot(namespace = "http://www.azureClaroPayAgile.com/soap/workItem", localPart = "getIssueRequest")
	@ResponsePayload
	public GetIssueResponse getIssueRequest(@RequestPayload GetIssueRequest request)
		{
			GetIssueResponse response = new GetIssueResponse();
			response.setIssueWorkItem(issueService.getIssue(request.getIdIssue()));
			return response;
		}

}
