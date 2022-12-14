package com.tp.farm.vo;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SurveyInputVO {
    private int msi_idx;
    private String msi_id;
    private String msi_memberName;
    private int msi_memberAge;
    private String msi_memberGender;
    private String msi_desiredArea;
    private String msi_desiredAreaDetail;
    private int msi_desiredTimeSowing;
    private String msi_desiredTimeSowingPart;
    private int msi_desiredHarvestTime;
    private String  msi_desiredHarvestTimePart;
    private String msi_cropClassification;
    private String msi_cultivationMethod;
    private String msi_farmingExperience;
    private String msi_hadMachinery;
}
