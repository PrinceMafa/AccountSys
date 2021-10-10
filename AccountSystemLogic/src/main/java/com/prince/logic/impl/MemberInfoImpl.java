package com.prince.logic.impl;

import com.prince.domain.dtos.MemberDto;
import com.prince.logic.MemberInfo;
import com.prince.translator.MemberTran;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MemberInfoImpl implements MemberInfo {
    private final MemberTran memberTran;


    @Autowired
    public MemberInfoImpl(MemberTran memberTran) {
        this.memberTran = memberTran;
    }

    @Override
    public List<MemberDto> getAllMember() {
        List<MemberDto> memberDtos = memberTran.getAllMember();
        return memberDtos;
    }

    @Override
    public MemberDto getMemberById(Long id) {
        return memberTran.getMemberById(id);
    }
}
