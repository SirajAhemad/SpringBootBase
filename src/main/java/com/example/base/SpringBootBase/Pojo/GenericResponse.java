package com.example.base.SpringBootBase.Pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@JsonIgnoreProperties
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
@NoArgsConstructor
public class GenericResponse implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String code;

    private String message;

    private Object data;

    /**
     * @param code
     * @param message
     */
    public GenericResponse(final String code, final String message) {
        super();
        this.code = code;
        this.message = message;
    }

    /**
     * @param code
     * @param message
     * @param data
     */
    public GenericResponse(final String code, final String message, final Object data) {
        super();
        this.code = code;
        this.message = message;
        this.data = data;
    }
}

