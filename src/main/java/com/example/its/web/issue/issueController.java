package com.example.its.web.issue;

import com.example.its.domain.issue.IssueService;
import com.example.its.domain.issue.issueEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class issueController {

    private final IssueService issueService = new IssueService();
    @GetMapping("/issues")
    public String showList(Model model) {
        // javaデータをThmeleafで表示するためには、SpringのMODELを利用して表示する必要がある
        model.addAttribute("issueList", issueService.findAll());
        return "issues/list";
    }

}
