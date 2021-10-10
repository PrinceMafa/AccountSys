package com.prince.logic;

import com.prince.domain.dtos.MemberDto;

import java.util.List;

public interface MemberInfo {
    List<MemberDto> getAllMember();
    MemberDto getMemberById(Long id);
}
