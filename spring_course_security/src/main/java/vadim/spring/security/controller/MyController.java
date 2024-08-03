package vadim.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MyController {
    @GetMapping("/")
    public String getInfoForAllEmps(){
        return "view_for_all_employees";
    }

    @GetMapping("/hr_info")
    public String getInfoOnlyForHR(){
        return "view_for_hr";
    }

    @GetMapping("/manager_info")
    public String getInfoOnlyForManager(){
        return "view_for_manager";
    }
}
