package com.example.base.SpringBootBase.Util;

import com.example.base.SpringBootBase.Constants.ApplicationResponseContants;
import com.example.base.SpringBootBase.Pojo.GenericResponse;
import org.springframework.stereotype.Component;

@Component
public class CommonServices {



    public GenericResponse generateGenericSuccessResponse(final Object object) {
        return new GenericResponse(ApplicationResponseContants.SUCCESS_RESPONSE,
                ApplicationResponseContants.SUCCESS_RESPONSE_MESSAGE, object);

    }

    public GenericResponse generateSuccessResponseWithMessageKey(final String code) {
        return new GenericResponse(ApplicationResponseContants.SUCCESS_RESPONSE,ApplicationResponseContants.SUCCESS_RESPONSE_MESSAGE);
    }

    public GenericResponse generateSuccessResponseWithMessageKeyAndData(final String message, final Object data) {
        return new GenericResponse(ApplicationResponseContants.SUCCESS_RESPONSE,ApplicationResponseContants.SUCCESS_RESPONSE_MESSAGE, data);
    }



}
