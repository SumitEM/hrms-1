package com.adt.hrms.service;

import java.io.IOException;
import java.util.List;

import com.adt.hrms.model.Interview;
import com.adt.hrms.ui.InterviewModelDTO;

import javax.servlet.http.HttpServletResponse;

public interface InterviewService {

	public String saveInterview(Interview in);

	public List<Interview> listAllInterviewDetails();

	public String updateToInterviewDetails(Interview emp);

	public Interview getInterviewDetailsById(Integer empId);

	public Interview getInterviewDetailByInterviewIdAndRound(Integer interviewId, Integer round);

	public Interview updateInterviewDetailByInterviewIdAndRound(Integer interviewId, Integer round, InterviewModelDTO intw);

	//*** Added:- 01/06/2023 ***
	public String saveInterviewNew(InterviewModelDTO intwDto);

	//HRMS-92 -> START
	public List<Interview> SearchByCandidateName(String candidateName);

	public List<Interview> SearchBySource(String source);

	public List<Interview> SearchByClientName(String clientName);
   //HRMS-92 ->END

	public void listAllInterviewDetailsInExcel(HttpServletResponse responseExcel) throws IOException;
}
