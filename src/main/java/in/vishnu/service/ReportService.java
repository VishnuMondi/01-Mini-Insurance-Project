package in.vishnu.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Service;

import in.vishnu.entity.CitizenPlan;
import in.vishnu.request.SearchRequest;


@Service
public interface ReportService {
	public List<String> getPlanNames();
	 public List<String> getPlanStatuses();
	 public List<CitizenPlan> search(SearchRequest request);
	 public boolean exportExcel(HttpServletResponse response) throws Exception;
	 public boolean exportPdf(HttpServletResponse response) throws Exception;
}
	