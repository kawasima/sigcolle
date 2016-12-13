package net.unit8.sigcolle.model;

import lombok.Data;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;

/**
 * @author kawasima
 */
@Entity
@Data
public class SignatureAttribute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long signatureAttributeId;

    private Long campaignId;
    private String name;
    private String type;
}
