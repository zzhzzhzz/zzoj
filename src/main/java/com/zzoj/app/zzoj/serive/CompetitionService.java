package com.zzoj.app.zzoj.serive;

import com.zzoj.app.zzoj.domain.Competition;
import com.zzoj.app.zzoj.vo.Compedetail;

import java.util.List;

public interface CompetitionService {

    int saveCompetition(Competition competition);

    List<Compedetail> getCompetition(int id);

}
