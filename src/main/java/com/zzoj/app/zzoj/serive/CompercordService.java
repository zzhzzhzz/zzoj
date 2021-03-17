package com.zzoj.app.zzoj.serive;

import com.zzoj.app.zzoj.domain.Compercord;

import java.util.List;

public interface CompercordService {

    int saveCompercord(Compercord compercord);

    List<Compercord> getCompercord(int id);

}
