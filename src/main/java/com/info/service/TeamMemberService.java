package com.info.service;

import com.info.model.TeamLeader;
import com.info.model.TeamMember;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeamMemberService {
    void save(TeamMember teamMember);
    List<TeamMember> getAllMembers(String teamLeaderEmail);
    TeamMember findById(int id);
    void editTeamMember(TeamMember teamMember, int id);
    void deleteById(int id);
    List<TeamMember> getAll();
}
