package com.parksrazor.web.mappers;

import com.parksrazor.web.domains.PlayerDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerMapper {
    public List<PlayerDTO> selectAll();

    public PlayerDTO login(PlayerDTO params);

    public PlayerDTO selectOne(String searchWord);
}
