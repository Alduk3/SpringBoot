package com.riwi.riwiplatform.infrastructure.abstract_services;

import com.riwi.riwiplatform.api.dto.request.MessageRequest;
import com.riwi.riwiplatform.api.dto.response.MessageResponse;

public interface IMessageService extends CRUDService<MessageRequest, MessageResponse, Long>{
}
