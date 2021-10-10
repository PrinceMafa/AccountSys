package com.prince.translator.files;

import com.prince.domain.dtos.MemberDto;
import com.prince.domain.persistence.Member;
import com.prince.repository.repos.MemberRepo;
import com.prince.translator.MemberTran;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MemberTransImpl implements MemberTran {
    private final MemberRepo memberRepo;

    @Autowired
    public MemberTransImpl(MemberRepo memberRepo) {
        this.memberRepo = memberRepo;
    }

    @Override
    public List<MemberDto> getAllMember() {
        List<MemberDto> allMember = new ArrayList<>();
        try {
            for(Member member :memberRepo.findAll()){
                allMember.add(new MemberDto(member));
            }
        }catch (Exception e){
            throw new RuntimeException("Cannot get all members from the database",e);
        }
        return allMember;
    }

    @Override
    public MemberDto getMemberById(Long id) {
        Member member;
        try {
            member = memberRepo.getOne(id);
            member.setPoints(13);
            memberRepo.save(member);
        }catch (Exception e){
            throw new RuntimeException("Cannot get member by id from the database",e);
        }
        return new MemberDto(member);
    }

}
