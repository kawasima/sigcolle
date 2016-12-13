package net.unit8.sigcolle.model;

import lombok.Data;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;

import java.io.Serializable;

/**
 * @author kawasima
 */
@Entity
@Data
public class Signature implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long signatureId;

    String name;
    String signatureComment;

    Long campaignId;
}
