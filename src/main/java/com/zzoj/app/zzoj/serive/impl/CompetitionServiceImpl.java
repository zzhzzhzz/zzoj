package com.zzoj.app.zzoj.serive.impl;

import com.zzoj.app.zzoj.dao.CompetitionDao;
import com.zzoj.app.zzoj.domain.Competition;
import com.zzoj.app.zzoj.serive.CompetitionService;
import com.zzoj.app.zzoj.vo.Compedetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CompetitionServiceImpl implements CompetitionService {

    @Autowired
    private CompetitionDao competitionDao;


    @Override
    public int saveCompetition(Competition competition) {
        return competitionDao.saveCompetition(competition);
    }

    @Override
    public List<Compedetail> getCompetition(int id) {
        return competitionDao.getCompetition(id);
    }


}
