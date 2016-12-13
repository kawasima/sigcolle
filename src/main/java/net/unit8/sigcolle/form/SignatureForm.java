package net.unit8.sigcolle.form;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;

/**
 * @author kawasima
 */
@Data
public class SignatureForm extends FormBase {
    @DecimalMin("1")
    @DecimalMax("9999")
    private String campaignId;

    @NotBlank
    @Length(max = 50)
    private String name;

    @Length(max = 5000)
    private String signatureComment;

    public Long getCampaignIdLong() {
        return Long.parseLong(campaignId);
    }

    @Override
    public boolean hasErrors() {
        return super.hasErrors();
    }

    @Override
    public boolean hasErrors(String name) {
        return super.hasErrors(name);
    }

}
