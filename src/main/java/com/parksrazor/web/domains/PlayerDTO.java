package com.parksrazor.web.domains;

import org.springframework.stereotype.Component;

@Component
public class PlayerDTO {
    private String playerId, playerName, ePlayerName, nickname, joinYyyy, position, backNo, nation, birthDate, solar,
            height, weight, teamId;

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setePlayerName(String ePlayerName) {
        this.ePlayerName = ePlayerName;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setJoinYyyy(String joinYyyy) {
        this.joinYyyy = joinYyyy;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setBackNo(String backNo) {
        this.backNo = backNo;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setSolar(String solar) {
        this.solar = solar;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getePlayerName() {
        return ePlayerName;
    }

    public String getNickname() {
        return nickname;
    }

    public String getJoinYyyy() {
        return joinYyyy;
    }

    public String getPosition() {
        return position;
    }

    public String getBackNo() {
        return backNo;
    }

    public String getNation() {
        return nation;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getSolar() {
        return solar;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }

    public String getTeamId() {
        return teamId;
    }
}
