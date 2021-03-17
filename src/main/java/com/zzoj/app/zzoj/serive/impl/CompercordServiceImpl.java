package com.zzoj.app.zzoj.serive.impl;

import com.zzoj.app.zzoj.dao.CompercordDao;
import com.zzoj.app.zzoj.domain.Compercord;
import com.zzoj.app.zzoj.serive.CompercordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompercordServiceImpl implements CompercordService {

    @Autowired
    private CompercordDao compercordDao;

    @Override
    public int saveCompercord(Compercord compercord) {
        return compercordDao.saveCompercord(compercord);
    }

    @Override
    public List<Compercord> getCompercord(int id) {
        List<Compercord> myrecord = compercordDao.getMyrecord(id);

        return myrecord;
    }


}
