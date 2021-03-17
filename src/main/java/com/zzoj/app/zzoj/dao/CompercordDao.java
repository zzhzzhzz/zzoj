package com.zzoj.app.zzoj.dao;

import com.zzoj.app.zzoj.domain.Compercord;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompercordDao {

    int saveCompercord(Compercord compercord);

    List<Compercord> getMyrecord(int id);
}
