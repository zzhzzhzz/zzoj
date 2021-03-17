package com.zzoj.app.zzoj.dao;

import com.zzoj.app.zzoj.domain.User;
import com.zzoj.app.zzoj.vo.UserRank;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    User getUserById(int id);

    User getUserByUserName(String username);

    int regNewUser(User user);

    void updateUser(User user);

    User getUser(String username, String password);

    int getUserRank(int id);

    List<UserRank> getUserRankList();

    void updateUserByUser(User user);
}
