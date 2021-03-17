package com.zzoj.app.zzoj.dao;

import com.zzoj.app.zzoj.domain.Competition;
import com.zzoj.app.zzoj.vo.Compedetail;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompetitionDao {

    int saveCompetition(Competition competition);

    List<Compedetail> getCompetition(int id);

}
