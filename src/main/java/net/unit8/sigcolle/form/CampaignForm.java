package net.unit8.sigcolle.form;

import lombok.Data;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;

/**
 * @author kawasima
 */
@Data
public class CampaignForm extends FormBase {
    @DecimalMin("1")
    @DecimalMax("9999")
    private String campaignId;

    public Long getCampaignIdLong() {
        return Long.parseLong(campaignId);
    }
}
