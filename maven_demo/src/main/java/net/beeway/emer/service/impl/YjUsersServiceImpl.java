package net.beeway.emer.service.impl;

import net.beeway.emer.dao.YjUsersMapper;
import net.beeway.emer.entry.YjUsers;
import net.beeway.emer.service.YjUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YjUsersServiceImpl implements YjUsersService {

    @Autowired
    private YjUsersMapper yjUsersMapper;

    public List<YjUsers> selectAll() {
        return yjUsersMapper.selectAll();
    }
}
