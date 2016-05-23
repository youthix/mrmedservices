package org.presentation.util;

import org.presentation.entities.ResponseObj;

/**
 * The utility class is used to map the Exception instances to the particular
 * functions and to accordingly set the require values.
 */

public class ServiceExceptionMapper {

	public static ResponseObj toResponse(Exception exceptionObj) {
		ResponseObj respObj = new ResponseObj();
		if (exceptionObj instanceof ServiceException) {
			System.out.println("EMapperIn");
			respObj.setErrorStatus("FAILURE");
			respObj.setErrorCode(exceptionObj.getMessage());
			System.out.println("EMapperOut");

		} else {

			respObj.setErrorStatus("FAILURE");
			respObj.setErrorCode(ServiceConstant.GENERIC_ERROR);
		}

		return respObj;

	}

}
