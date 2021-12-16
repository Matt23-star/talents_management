package com.foe.talentmanagementback.entity.bo;

import com.foe.talentmanagementback.entity.dto.ArchiveDTO;
import com.foe.talentmanagementback.entity.dto.EvaluationSendDTO;
import com.foe.talentmanagementback.entity.dto.EvaluationStatisticDTO;
import com.foe.talentmanagementback.entity.dto.WorkExperienceListDTO;

import java.util.List;

public class ExperienceDetailBO {

    private ArchiveDTO archive;

    private WorkExperienceListDTO workExperience;

    private List<EvaluationSendDTO> evaluationSends;

    private EvaluationStatisticDTO evaluationStatistic;

    public ExperienceDetailBO() {
    }

    public ArchiveDTO getArchive() {
        return this.archive;
    }

    public void setArchive(ArchiveDTO archive) {
        this.archive = archive;
    }

    public WorkExperienceListDTO getWorkExperience() {
        return this.workExperience;
    }

    public void setWorkExperience(WorkExperienceListDTO workExperience) {
        this.workExperience = workExperience;
    }

    public List<EvaluationSendDTO> getEvaluationSends() {
        return this.evaluationSends;
    }

    public void setEvaluationSends(List<EvaluationSendDTO> evaluationSends) {
        this.evaluationSends = evaluationSends;
    }

    public EvaluationStatisticDTO getEvaluationStatistic() {
        return this.evaluationStatistic;
    }

    public void setEvaluationStatistic(EvaluationStatisticDTO evaluationStatistic) {
        this.evaluationStatistic = evaluationStatistic;
    }

    @Override
    public String toString() {
        return "ExperienceDetailBO{" +
                "archive=" + archive +
                ", workExperienceList=" + workExperience +
                ", evaluationSends=" + evaluationSends +
                ", evaluationStatistic=" + evaluationStatistic +
                '}';
    }
}
