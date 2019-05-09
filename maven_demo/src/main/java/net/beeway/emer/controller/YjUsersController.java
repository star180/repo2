package net.beeway.emer.controller;

import net.beeway.emer.entry.YjUsers;
import net.beeway.emer.service.YjUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class YjUsersController {

    @Autowired
    private YjUsersService yjUsersService;

    @ResponseBody
    @RequestMapping("/findAll")
    public List<YjUsers> findAll() {
        return yjUsersService.selectAll();
    }
}
